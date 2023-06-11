import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int size = scanner.nextInt();
       System.out.println("Enter the elements in the array");
       int arr[] = new int[size];
       for(int i=0;i<size;i++){
        arr[i]=scanner.nextInt();
       }
       scanner.close();
        for(int i=0;i<=size-1;i++){
            for(int k=0;k<size-i-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        for(int i =0;i<=size-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
