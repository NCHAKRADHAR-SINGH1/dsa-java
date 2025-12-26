import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class SLL{
    Node head;
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
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
        Node currentNode=head;
        while(currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }
        return count;
    }
    int find(int data){
        int pos=-1;
        Node currentNode=head;
        while(currentNode!=null){
            pos++;
            if(currentNode.data==data){
               return pos;
            }
            currentNode=currentNode.next;
        }
        return -1;
    }
    void insertAt(int i,int data){
        if(i>=0 && i<=size()){
            if(i==0){
                addFirst(data);
                return;
            }else if(i==size()){
              addLast(data);
              return ;
            }else{
                int pos=-1;
                Node currentNode=head;
                while(currentNode!=null){
                    pos++;
                    if(pos==i-1){
                        Node newNode=new Node(data);
                        newNode.next=currentNode.next;
                        currentNode.next=newNode;
                        System.out.println("the element is inserted at position");
                        break;
                    }
                    currentNode=currentNode.next;
                }
            }
        }else{
            System.out.println("the elements has only"+" " +size()+" "+ "elements");
            System.out.println("we cant insert element in index :"+i);
        }
    }
    void reverse(Node currentNode){
        if(currentNode==null){
            return ;
        }
        reverse(currentNode.next);
        System.out.print(currentNode.data+"->");
    }
    void updateAt(int index,int data){
        int pos=-1;
        Node currentNode=head;
        while(currentNode!=null){
            pos++;
            if(pos==index){
                currentNode.data=data;
            }
            currentNode=currentNode.next;
        }
       
        
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("there is nothing to delete");
            return ;
        }else{
            head=head.next;
        }
    }
    void deleteLast(){
        if(head==null){
            System.out.println("there is nothing to delete");
            return ;
        }else if(head.next==null){
            head=null;
        }else{
            Node currentNode=head;
            while(currentNode.next.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=null;
        }
    }
    void deleteAt(int index){
        if(index>=0 && index < size()){
            if(index==0){
                deleteFirst();
                return ;
            }else{
                Node currentNode=head;
                int pos=-1;
                while(currentNode!=null){
                    pos++;
                    if(pos == index-1){
                        currentNode.next=currentNode.next.next;
                        break;
                    }
                    currentNode=currentNode.next;
                   
                }
            }
        }else{
            System.out.println("the elements has only"+" " +size()+" "+ "elements");
            System.out.println("we cant delete element in index :"+index); 
        }
    }
  } 

class Main{
    public static void main(String[] args){
        SLL s1=new SLL();
        s1.addFirst(10);
        s1.addLast(20);
        s1.addLast(30);
        s1.display();
        System.out.println();
        System.out.println("size:"+s1.size());
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to search:\t");
        int n=s1.find(sc.nextInt());
        if(n!=-1){
            System.out.println("the element is found at:"+n);
        }else{
            System.out.println("the element is not found ");
        }
        s1.insertAt(3,50);
        s1.display();
        s1.updateAt(3,40);
        s1.display();
        s1.deleteFirst();
        s1.deleteLast();
        s1.deleteAt(1);
        s1.display();
       
        
    }

}
