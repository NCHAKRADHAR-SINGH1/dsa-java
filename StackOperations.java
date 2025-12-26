class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Stack{
    Node top;
    void push(int data){
      Node newNode=new Node(data);
      if(top==null){
         top=newNode;
         System.out.println("the element"+" " +data+" "+ "is pushed into stack");
      }else{
        newNode.next=top;
        top=newNode;
        System.out.println("the element "+" " +data+" "+ "is pushed into stack");
      }
    }
    void pop(){
        if(top==null){
            System.out.println("there is no elemens to delete");
            return ;
        }else{
            System.out.println("the element"+" "+top.data+" "+"is popped from stack");
            top=top.next;
        }
    }
    void peek(){
        if(top==null){
            System.out.println("there is no peak element");
            return ;
        }else{
            System.out.println("the peak element is:"+top.data);
        }
    }
    int size(){
        int count=0;
        if(top==null){
            return 0;
        }
        Node currentNode=top;
        while(currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }
        return count;
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        Node currentNode=top;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
}

    class StackOperations{
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.peek();
        s1.pop();
        s1.pop();
        s1.peek();
        s1.display();
        int result=s1.size();
        if(result==-1){
            System.out.println("the stack is empty with 0 size");
        }else{
            System.out.println("the stack has elements with size:"+result);
        }
        boolean empty=s1.isEmpty();
        if(!empty){
            System.out.println("the stack has elements");
        }else{
            System.out.println("the stack has no elements");
        }
    }
}
