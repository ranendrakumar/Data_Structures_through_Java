import java.util.Scanner;

class LinkedList{
    class Node{
        int data;
        Node link;
    }
    Node newnode = new Node();
    private Node first;
   // private Node temp = first;
    Scanner sc = new Scanner(System.in);

    void insertRear(){
        Node temp = first;
        System.out.println("Enter the element to insert at rear end");
        int elem = sc.nextInt();
        Node newnode = new Node();
        newnode.data=elem;
        newnode.link=null;

        if(first==null){
            first=newnode;
        }
        else{
            while(temp.link!=null){
                temp=temp.link;
            }
            temp.link = newnode;
        }
    }

    void deleteRear(){
        Node temp = first;
        if(first==null){
            System.out.println("Deletion not possible list is empty");
        }
        else if(first.link==null){
            System.out.println("Deleted element is "+first.data);
            first=null;
        }
        else{
            while(temp.link.link!=null){
                temp = temp.link;
            }
            System.out.println("Deleted element is "+temp.link.data);
            temp.link=null;
        }
    }

    void insertFront(){
        System.out.println("Enter the element to insert");
        int ele = sc.nextInt();
        Node  newnode = new Node();
        newnode.data=ele;
        newnode.link=null;
        if(first==null){
            first = newnode;
        }
        else{
            newnode.link=first;
            first=newnode;
        }
    }

    void deleteFront(){
        if(first == null){
            System.out.println("Deletion not possibe list is empty");
        }
        else if(first.link==null){
            System.out.println("Deleted element is "+first.data);
            first=null;
        }
        else{
            System.out.println("Deleted element is "+first.data);
            first=first.link;
        }
    }

    void insertinter(){
        Node temp = first;
        int count =0;
        System.out.println("Enter the element in the list");
        int nval =sc.nextInt();
        temp = first;
        while(temp.link!=null){
            temp=temp.link;
            if(nval == temp.data){
                count++;
            }
        }
        if(count>0){
            
                System.out.println("temp value is "+temp.data);

        }
        else{
            System.out.println("element not");
        }
    }

    void display(){
        Node temp = first;
        if(first==null){
            System.out.println("Display not possible list is empty");
        }
        else if(first.link==null){
            System.out.println("Element in the list is "+first.data);
        }
        else{
            temp = first;
            System.out.println("Elements in the List is");
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.link;
            }
            System.out.print("null");
        }
        System.out.println();
    }
}

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int ch;
        while(true){
        System.out.println("=============================");
        System.out.println("Press 1 to insert at front end");
        System.out.println("Press 2 to insert at rear end");
        System.out.println("Press 3 to delete at front end");
        System.out.println("Press 4 to delete at rear end");
        System.out.println("Press 5 to display the list");
        System.out.println("Enter any number to exit");
        System.out.println("=============================");
        System.out.println("Enter Your choice");
            ch = scan.nextInt();
        switch(ch){
            case 1:ll.insertFront();
            break;
            case 2:ll.insertRear();
            break;
            case 3:ll.deleteFront();
            break;
            case 4:ll.deleteRear();
            break;
            case 5:ll.display();
            break;
            case 6:ll.insertinter();
            break;
            default:System.exit(0);
        }
        }
    }
}
