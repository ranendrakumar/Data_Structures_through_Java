import java.util.Scanner;

class Stack{
    private int stack[];
    private int top =-1;
    private Scanner sc = new Scanner(System.in);
    public Stack(int n){
        stack = new int[n];
    }
    public void push(){
        if(top==stack.length-1){
            System.out.println("Stack OverFlow. Insertion is not possible");
        }
        else{
        System.out.println("Enter the element to insert");
        int ele = sc.nextInt();
        top++;
        stack[top]=ele;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is underflow. Deletion is not possible");
        }
        else{
        System.out.println("Deleted element is "+(stack[top]));
        top--;
        }
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
        System.out.println();
    }
}

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n = sc.nextInt();
        Stack s = new Stack(n);
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
                case 1: s.push();
                break;
                case 2: s.pop();
                break;
                case 3: s.display();
                break;
                default : System.exit(0);
            }
        }
    }
}
