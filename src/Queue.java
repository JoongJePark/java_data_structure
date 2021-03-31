public class Queue {
    private int begin;
    private int end;
    private int queueSize;
    private char[] queueArr;

    public Queue(int queueSize) {
        this.queueSize = queueSize;
        queueArr = new char[this.queueSize];
        begin = 0;
        end = -1;
    }

    boolean isEmpty() {
        return begin > end;
    }

    boolean isFull() {
        return end+1 == queueSize;
    }

    void push(char data) {
        if (this.isEmpty()) {
            queueArr[begin] = data;
            end += 1;
        } else if (this.isFull()) {
            System.out.println("queue가 꽉 찼습니다");
        } else {
            for(int i=end; i>=begin; i--) {
                queueArr[i+1]=queueArr[i];
            }
            queueArr[begin] = data;
            end += 1;
        }
    }

    char pop() {
        if(this.isEmpty()){
            System.out.println("queue 가 비어있습니다");
            return ' ';
        } else {
            end -= 1;
            return queueArr[end];
        }
    }

    char back() {
        if(this.isEmpty()){
            System.out.println("queue 가 비어있습니다");
            return ' ';
        } else {
            return queueArr[end];
        }
    }

    int size() {
        return end-begin;
    }


    public static void main(String[] args) {
        Queue queue = new Queue(100);
        queue.push('a');
        System.out.println(queue.end);
        System.out.println(queue.isEmpty());
        System.out.println(queue.back());
        queue.push('b');
        System.out.println(queue.back());
        queue.pop();
        System.out.println(queue.back());

    }
}
