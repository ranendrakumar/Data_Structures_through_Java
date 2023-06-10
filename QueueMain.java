import java.util.Scanner;

class Queue{
    private int arr[];
    private Scanner sc = new Scanner(System.in);
    private int f=0;
    private int r=-1;
    public Queue(int n){
        arr = new int [n];
    }
    public void enqueue(){
        if(r==arr.length-1){
            System.out.println("Queue is full insertion not possible");
        }
        else{
            System.out.println("Enter element to be insert");
            int ele = sc.nextInt();
            r++;
            arr[r]=ele;
        }
    }
    public void dequeue(){
        if(r==-1 || f>r){
            System.out.println("Queue is empty deletion is not possible");
        }
        else{
            System.out.println("Element deleted is "+arr[f]);
            f++;
        }
    }
    public void display(){
        if(r==-1 || f>r){
            System.out.println("Queue is empty display not possible");
        }
        else{
            for(int i =f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Queue");
        int n = sc.nextInt();
        Queue q = new Queue(n);
        while (true) {
            System.out.println("===============================================");
            System.out.println("Enter 1 to Insert the element");
            System.out.println("Enter 2 to Delete the element");
            System.out.println("Enter 3 to Display the elements");  
            System.out.println("Enter any number to exit");
            System.out.println("===============================================");
            System.out.print("Choose one option ");
            int ch = sc.nextInt();
            switch(ch){
                case 1: q.enqueue();
                break;
                case 2: q.dequeue();
                break;
                case 3: q.display();
                break;
                default : System.exit(0);
            }
        }
    }
}
