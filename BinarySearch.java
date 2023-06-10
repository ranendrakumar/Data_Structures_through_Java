import java.util.*;
class BinarySearch{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int ll=0,ul=arr.length-1,mid;
        System.out.println("Enter the element to search");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        while(ll<=ul){
            mid =(ll+ul)/2;
            if(key==arr[mid]){
                System.out.println("Element found at index "+mid);
                break;
            }
            else if(key>arr[mid]){
                ll = mid+1;
            }
            else if(key<arr[mid]){
                ul = mid-1;
            }
            else {
                System.out.println("Element not found");
                break;
            }
        }
    }
}