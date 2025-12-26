import java.util.Arrays;
class Stack{
    int data;
    int arr[];
    int top=-1;
    int maxSize;
    Stack(int maxSize){
        this.maxSize=maxSize;
        arr=new int[maxSize];
        Arrays.fill(arr,-1);
    }
    void push(int data){
        if(top==maxSize-1){
           System.out.println("Stack overflow!!"+" "+data+" "+"cannot be pushed into stack");
        }else{
            top++;
            arr[top]=data;
            System.out.println("the element"+" "+data+" "+"is pushed into stack");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack underflow!!cannot be popped from the stack");
        }else{
            System.out.println("the element"+" "+arr[top]+" "+"is popped from stack");
            arr[top]=-1;
            top--;
            
        }
    }
    void peek(){
        System.out.println("the pop element in the stack is:"+arr[top]);
    }
    boolean isEmpty(){
        return top==-1;
    }
    int size(){
        return top+1;
    }
    void display(){
        if(top==-1){
          System.out.println("there is no elements in the stack ");
        }else{
           int  currentNode=top;
           while(currentNode >= 0){
             System.out.println(arr[currentNode]);
             currentNode--;
           }
        }
    }


}
public class StackArrayOpeations {
    public static void main(String[] args) {
    Stack s1=new Stack(3);
    s1.push(10);
    s1.push(20);
    s1.push(30);
    s1.push(40);
    s1.display();
    s1.pop();
    s1.display();
    s1.peek();
    int n=s1.size();
    System.out.println("the size of the stack:"+n);
    boolean result=s1.isEmpty();
    if(!result){
        System.out.println("the stack is not element");
    }else{
        System.out.println("the stack is empty");
    }

    }
    
}
