import java.util.Scanner;

class Array{
    private int arr[];
    private Scanner sc = new Scanner(System.in);
   public Array(int n){
        arr = new int[n];
    }
   public void insert(){
       System.out.println("Enter the postion to enter the element from 0 to "+(arr.length-1));
       int pos = sc.nextInt();
       if(pos>arr.length-1){
        System.out.println("The range must be in 0 to "+(arr.length-1));
       }
       else{
       System.out.println("Enter the element");
       int ele = sc.nextInt();
       arr[pos]=ele;
       }
    }
   public void delete(){
       System.out.println("Enter the postion to delete the elemnt");
       int pos = sc.nextInt();
       System.out.println("The deleted element is "+(arr[pos]));
       arr[pos]=0;
    }
  public  void search(){
    int count =-1;
    System.out.println("Enter the element to search");
    int key = sc.nextInt();
    for(int i=0;i<=arr.length-1;i++){
        if(key ==arr[i]){
            count=i;
        }
    }
    if(count>-1){
        System.out.println("Element found at index "+count);
    }
    else{
        System.out.println("Element not Found");
    }
  }
  public  void display(){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        Array a = new Array(n);
         
        while(true){
            System.out.println("===============================================");
            System.out.println("Enter 1 to Insert the element");
            System.out.println("Enter 2 to Delete the element");
            System.out.println("Enter 3 to Display the elements");
            System.out.println("Enter 4 to Search the elements");  
            System.out.println("Enter any number to exit");
            System.out.println("===============================================");
            System.out.print("Choose one option ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:a.insert();
                break;
                case 2:a.delete();
                break;
                case 3:a.display();
                break;
                case 4:a.search();
                break;
                default:System.exit(0);
            }
        }
    }
}
