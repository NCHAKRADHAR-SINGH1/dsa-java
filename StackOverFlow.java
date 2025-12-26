
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Stack{
    Node top;
    int currentSize=0;
    int maxSize;
    Stack(int maxSize){
        this.maxSize=maxSize;
    }
    void push(int data){
      Node newNode=new Node(data);
      if(currentSize==maxSize){
         System.out.println("stack overflow!! cannot push"+data);
      }
       else if(top==null){
        top=newNode;
        currentSize++;
        System.out.println("successfully pushed the "+" "+data+" "+"inside the stack");
      }else{
        newNode.next=top;
        top=newNode;
        currentSize++;
         System.out.println("successfully pushed the "+" "+data+" "+"inside the stack");
      }
    }
    void pop(){
       if(top==null){
        System.out.println("stack underflow!! no need to pop");
        return ;
       }else{
           System.out.println("successfully popped the "+" "+top.data+" "+"inside the stack");
           top=top.next;
           currentSize--;
       }
    }
    
}
class Main{
    public static void main(String[] args){
        Stack s1=new Stack(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.pop();
        s1.push(40);


    }
}