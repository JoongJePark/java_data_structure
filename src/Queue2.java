public class Queue2 {
    private int begin;
    private int end;
    private int queue2Size;
    private char[] queue2Arr;

    public Queue2(int queue2Size) {
        this.queue2Size = queue2Size;
        queue2Arr = new char[this.queue2Size];
        begin = 0;
        end = 0;
    }

    boolean isEmpty() {
        return begin == end;
    }

    boolean isFull() {
        return end + 1 == queue2Size;
    }

    void push(char data) {
        if (this.isFull()) {
            System.out.println("queue2가 꽉 찼습니다");
        } else {
            queue2Arr[end] = data;
            end += 1;
        }
    }

    char pop() {
        if (this.isEmpty()) {
            System.out.println("queue2 가 비어있습니다");
            return ' ';
        } else {
            queue2Arr[begin] = ' ';
            begin += 1;
            return queue2Arr[begin];
        }
    }

    char back() {
        if (this.isEmpty()) {
            System.out.println("queue2 가 비어있습니다");
            return ' ';
        } else {
            return queue2Arr[begin];
        }
    }

    int size() {
        return end - begin;
    }


    public static void main(String[] args) {
        Queue2 queue2 = new Queue2(100);
        queue2.push('a');
        System.out.println(queue2.end);
        System.out.println(queue2.isEmpty());
        System.out.println(queue2.back());
        queue2.push('b');
        System.out.println(queue2.back());
        queue2.pop();
        System.out.println(queue2.back());

    }
}
