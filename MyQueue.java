package question3;

public class MyQueue {
    
    stack primarysatStack = new stack();
    stack secondaryStack  = new stack();
    
    
    int peek;

    // public MyQueue() {
        
    // }
    
    public void push(int x) {
        
        MyQueue primaryStack;
        if(primarysatStack.isEmpty()) {
            peek = x;
        }
        
        primaryStack.push(x);
    }
    
    public int pop() {
        MyQueue primaryStack;
        
        while(!primaryStack.empty()){
            secondaryStack.push(primaryStack.pop());
        }
        
        
        int popped = secondaryStack.pop();
        
        
        if(!secondaryStack.isEmpty()) {
            peek = secondaryStack.peek();
        }
        
        
        while(!secondaryStack.isEmpty()){
            primaryStack.push(secondaryStack.pop());
        }
        
        
    }
    
    public int peek() {
        return peek;
    }
    
    public boolean empty() {
        stack primaryStack;
        return primaryStack.isEmpty();
    }
    public void show(){
 for (int num : secondaryStack){
            System.out.print(num + " ");
        }
        System.out.println();

    }
   
    public static void main(String[] args) {
        MyQueue num =new MyQueue();
        num.push(3);
        num.push(5);
        System.out.println(num.pop());


    }
}