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
    // Method push to add an element x in the stack
    public void push(int x){
        // create new node NewNode
        Node newNode = new Node();
        if (newNode == null) {
            System.out.println("Stack Overflow");
            return;
        }
        // initialize data into newNode data field
        newNode.data = x;
        // put top reference into temp link
        newNode.next = head;
        // update head reference
        head = newNode;
    }

    //Method to print Stack
    public void print() {
        // check for stack empty
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        } else {
            Node newNode = head;
            System.out.print("Stack: ");
            while (newNode != null) {
                // print node data
                System.out.print(newNode.data+" ");
//                System.out.printf("%d->", newNode.data);
                // assign newNode link to temp
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
    }
}