class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class DLL{
    Node head;
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
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
            newNode.prev=currentNode;
        }
    }
    void display(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null") ;   
    
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
    void insertAt(int index,int data){
        if(index >=0 && index<=size()){
           if(index==0){
            addFirst(data);
            System.out.println("the element"+" "+data+" "+"is successfully inserted in the first");
            return ;
           }
           else if(index==size()){
            addLast(data);
            System.out.println("the element"+" "+data+" "+"is successfully inserted in the last");
            return ;
           }else{
              int position=-1;
              Node currentNode=head;
              while(currentNode!=null){
                position++;
                if(position==index-1){
                    Node newNode=new Node(data);
                    newNode.prev=currentNode;
                    newNode.next=currentNode.next;
                    currentNode.next.prev=newNode;
                    currentNode.next=newNode;
                    System.out.println("the element"+" "+data+" "+"is successfully inserted in the middle");
                    break;
                }
                currentNode=currentNode.next;
              }
           }
        }else{
           System.out.println("the dll has size of elements "+" "+size()+" "+"only cant insert" ); 
           System.out.println("the element"+" "+data+" "+"is not inserted in the dll");
        }
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("no elements are there in the dll");
        }else if(head.next==null){
            head=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    void deleteLast(){
        if(head==null){
           System.out.println("no elements are there in the dll");
        }else if(head.next==null){
            head=null;
        }else{
            Node currentNode=head;
            while(currentNode.next.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next.prev=null;
            currentNode.next=null;
            
        }
    }
    void deleteAt(int index){
        if(index>=0 && index <size()){
            if(index==0){
                deleteFirst();
                return ;
            }else{
                int position=-1;
                Node currentNode=head;
                while(currentNode!=null){
                    position++;
                    if(index-1==position){
                       currentNode.next=currentNode.next.next;
                       if(currentNode.next!=null){   // check before accessing prev
                         currentNode.next.prev=currentNode;
                       }
                       System.out.println("the element at"+" "+index+" "+"is successfully deleted");
                       break;
                    }
                    currentNode=currentNode.next;
                }
            }
        }else{
            System.out.println("the dll has size of elements "+" "+size()+" "+"only cant delete");
            System.out.println("the element at"+" "+index+" "+"is not deleted in the dll");
        }
    }
    void updateAt(int index,int data){
        Node currentNode=head;
        int position=-1;
        while(currentNode!=null){
            position++;
            if(index==position){
                currentNode.data=data;
                System.out.println("the element at index"+" "+index+" "+"is updated to"+" "+data);
                break;
            }
            currentNode=currentNode.next;

        }
    }
    void reverse(Node currentNode){
        if(currentNode==null){
            return ;
        }else{
            reverse(currentNode.next);
            System.out.print(currentNode.data+"->");
        }
    }
    
    
}

class Main{
    public static void main(String[] args) {
        DLL d1=new DLL();
        d1.addFirst(10);
        d1.addLast(20);
        d1.addLast(30);
        d1.addLast(50);
        d1.display();
        int s=d1.size();
        System.out.println("the size :"+s);
        d1.insertAt(3,40);
        d1.insertAt(5,60);
        d1.display();
        d1.deleteAt(0);
        d1.insertAt(0,60);
        d1.deleteLast();
        d1.display();
        d1.updateAt(0,10);
        d1.display();
        d1.reverse(d1.head);
    }
}