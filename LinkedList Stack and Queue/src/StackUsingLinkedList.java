// Create Stack Using Linked list
class StackUsingLinkedList {
    // A linked list node
    private class Node {
        int data;
        Node next;
    }
    Node head;
    // Constructor
    StackUsingLinkedList(){
        this.head = null;
    }
    // Method to add an element x in the stack
    public void push(int x){
        // create new node NewNode
        Node newNode = new Node();
        if (newNode == null) {
            System.out.println("Stack Overflow");
            return;
        }
        // initialize data into newNode data field
        newNode.data = x;
        // put head reference into newNode
        newNode.next = head;
        // update head reference
        head = newNode;
    }
    // Method to check if the stack is empty or not
    public boolean isEmpty(){
        return head == null;
    }
    // Method to peek elements in Stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return head.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    // Method to pop head element from the stack
    public void pop(){
        System.out.println("Deleting the top element of the Stack");
        // check for stack empty
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        // update the head element to point to the next node
        head = (head).next;
    }
    public void print() {
        // check for stack empty
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        } else {
            Node newNode = head;
            while (newNode != null) {
                // print node data
                System.out.print(newNode.data+" ");
                // assign newNode link to next newNode
                newNode = newNode.next;
            }
        }
    }
// main class
    public static void main(String[] args){
        // create Object of Implementing class
        StackUsingLinkedList obj = new StackUsingLinkedList();
        // insert Stack value
        obj.push(70);
        obj.push(30);
        obj.push(56);
        // print Stack elements
        obj.print();
//        // print Head element of Stack
        System.out.println("Head element of the Stack is: "+obj.peek());
        // Delete top element of Stack
        obj.pop();
//        obj.pop();
        // print Stack elements
        obj.print();
        obj.pop();
        obj.pop();
        obj.print();
    }
}