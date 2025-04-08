public class CharStack {

    char[] arr;
    int top;
    int n;

    CharStack(char[] arr, int top){
        this.arr = arr;
        this.top = top;
        this.n = arr.length;
    }
    CharStack(int size){
        this.arr = new char[size];
        this.top = -1;
        this.n = size;
    }


    void push(char c){
        if(top == n-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = c;
    }
    char pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return '\0';
        }
        return arr[top--];
    }

    char peek(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return '\0';
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull() {
        return top == n - 1;
    }
}