import java.util.Arrays;
class Queue{
    int data;
    int arr[];
    int maxSize;
    int index=-1;
    int tail=-1;
    Queue(int maxSize){
        this.maxSize=maxSize;
        arr=new int[maxSize];
        Arrays.fill(arr,-1);
    }
    void queue(int data){
        if(index==maxSize-1){
            System.out.println("Queue overflow"+" "+data+" "+"cannot be added into queue");
        }else{
            index++;
            arr[index]=data;
            System.out.println("the element"+" "+data+" "+"is added into queue");
        }
    }
    void dequeue(){
        if(index==-1){
            System.out.println("queue is empty!!,the element"+" "+data+" "+"cannot be added into queue");
        }else{
            tail++;
            System.out.println("the element"+" "+arr[tail]+" "+"is deleted into queue");
            arr[tail]=-1;
        }
    }
    void peek(){
        if(tail==-1){
            System.out.println("no elements in the queue");
        }
        
    }
}





public class QueueArrayOperations {
    public static void main(String[]args){
        Queue q1=new Queue();
        q1.queue(10);

    }
}
