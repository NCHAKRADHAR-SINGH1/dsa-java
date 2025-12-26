class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class QueueOperations{
    Node head,tail;
    void enqueue(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            System.out.println("the element"+data+"is succesfully added into queue");
        }else{
            tail.next=newNode;
            tail=newNode;
            System.out.println("the element"+data+"is succesfully added into queue");
        }
    }
    void dequeue(){
        if(head==null){
            System.out.println("the queue is empty nothing to delete");
        }else{
            System.out.println("the element"+" "+head.data+" "+"is succesfully deleted from queue");
            head=head.next;
            if(head==null){
                tail=null;
                return ;
            }
        }
    }
    boolean isEmpty(){
        return head==null;
    }
    void peek(){
        System.out.println("the top element in the queue:"+head.data);
    }
    void display(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    int size(){
        int count=0;
        if(head==null){
            return 0;
        }else{
             Node currentNode=head;
             while(currentNode!=null){
               count++;
               currentNode=currentNode.next;
            }
            return count;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        QueueOperations  q1=new QueueOperations();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.peek();
        q1.dequeue();
        q1.dequeue();
        q1.display();
        boolean empty=q1.isEmpty();
        if(!empty){
            System.out.println("the queue has elements");
        }else{
            System.out.println("the queue has no elements");
        }
        int n=q1.size();
        System.out.println("the queue has elements of size:"+n);
        

    }
}
