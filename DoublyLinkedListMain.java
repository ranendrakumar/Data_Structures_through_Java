import java.util.Scanner;
class DoublyLinkedList{
    class Node{
        Node prelink;
        int data;
        Node nxtlink;
    }
    Node first;
    Scanner sc = new Scanner(System.in);
    void insertFront(){
        Node newnode = new Node();
        System.out.println("Enter the element to insert at first end");
        int elem = sc.nextInt();
        newnode.prelink = null;
        newnode.data=elem;
        newnode.nxtlink=null;
        if(first==null){
            first = newnode;
        }
        else{
            newnode.nxtlink=first;
            first.prelink=newnode;
            newnode.prelink=null;
            first = newnode;
        }
    }
    void insertRear(){
        Node newnode = new Node();
        System.out.println("Enter the element to be insert at rear end");
        int elem = sc.nextInt();
        newnode.data=elem;
        newnode.prelink=null;
        newnode.nxtlink=null;

        if(first==null){
            first=newnode;
        }
        else{
            Node temp = first;
            while(temp.nxtlink!=null){
                temp=temp.nxtlink;
            }
            temp.nxtlink=newnode;
            newnode.prelink=temp;
            newnode.nxtlink=null;
        }
    }
    void deleteFront(){
        if(first==null){
            System.out.println("List is empty.Deletion not possible");
        }
        else if(first.prelink==null && first.nxtlink==null){
            System.out.println("Deleted element is "+first.data);
            first=null;
        }
        else{
            System.out.println("Deleted element is "+first.data);
            first = first.nxtlink;
            first.prelink=null;
        }
    }
    void deleteRear(){
        if(first==null){
            System.out.println("List is empty.Deletion not possible");
        }
        else if(first.prelink==null && first.nxtlink==null){
            System.out.println("Deleted element is "+first.data);
            first=null;
        }
        else{
            Node temp = first;
            while(temp.nxtlink.nxtlink!=null){
                temp = temp.nxtlink;
            }
            System.out.println("Deleted element is "+temp.data);
            temp.nxtlink=null;
        }
    }
    void displayForward(){
        if(first==null){
            System.out.println("Linkedlist is empty display not possible");
        }
        else if(first.nxtlink==null && first.prelink==null){
            System.out.println("Element in the List is"+first.data);
        }
        else{
            Node temp=first;
            System.out.println("Elements in the list is");
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.nxtlink;
            }
            System.out.print("null");
        }
        System.out.println();
    }
    void displayRear(){
        if(first==null){
            System.out.println("Linkedlist is empty display not possible");
        }
        else if(first.nxtlink==null && first.prelink==null){
            System.out.println("Element in the List is"+first.data);
        }
        else{
            Node temp = first;
            while(temp.nxtlink!=null){
                temp=temp.nxtlink;
            }
            System.out.println("Elements in the list is");
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.prelink;
            }
            System.out.print("null");
        }
        System.out.println();
    }
    
}

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList dl = new DoublyLinkedList();
        while(true){
            System.out.println("=============================");
            System.out.println("Press 1 to insert data at front");
            System.out.println("Press 2 to insert data at rear end");
            System.out.println("Press 3 to delete data at front end");
            System.out.println("Press 4 to delete data at rear end");
            System.out.println("Press 5 to display data in forward direction");
            System.out.println("Press 6 to display data in reverse direction");
            System.out.println("Enter any number to exit");
            System.out.println("=============================");
            System.out.println("Enter Your choice");
            int ch = scan.nextInt();
            switch(ch){
                case 1:dl.insertFront();
                break;
                case 2:dl.insertRear();
                break;
                case 3:dl.deleteFront();
                break;
                case 4:dl.deleteRear();
                break;
                case 5:dl.displayForward();
                break;
                case 6:dl.displayRear();
                break;
                default:System.exit(0);
                break;
            }
        }
        
    }
}





