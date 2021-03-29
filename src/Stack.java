public class Stack {
    private int top;
    private int stackSize;
    private char[] stackArr;

    public Stack(int stackSize){
        top = -1;
        this.stackSize = stackSize;
        stackArr =new char[this.stackSize];
    }
    boolean isEmpty() {
        return (top==-1);
    }
    boolean isFull() {
        return (top==stackSize-1);
    }
    void push(char data) {
        if(!(this.isFull())){
            stackArr[top+1] = data;
            top += 1;
        } else {
            System.out.println("스택이 꽉 찼습니다. 데이터를 넣을 수 없습니다.");
        }
    }

    char pop() {
        char popData = stackArr[top];
        stackArr[top] = ' ';
        top -= 1;
        return popData;
    }

    char peek() {
        return stackArr[top];
    }


    public static void main(String[] args) {
        Stack stack = new Stack(2);
        System.out.println(stack.isEmpty());
        stack.push('a');
        System.out.println(stack.isEmpty());
        System.out.println(stack.top);
        System.out.println(stack.isFull());
        stack.push('b');
        System.out.println(stack.top);
        System.out.println(stack.isFull());
        stack.push('b');
        System.out.println(stack.top);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.top);
    }
}