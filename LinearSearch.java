import java.util.Scanner;
class Search{
    int search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int key = sc.nextInt();
        int count =-1;
        for(int i=0;i<=arr.length-1;i++){
            if(key==arr[i]){
                count=i;
            }
        }
        return count;
    }
}
public class LinearSearch {
    public static void main(String[] args) {
        Search sh = new Search();
        int res = sh.search();
        if(res>=0){
            System.out.println("Element found at index "+res);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
