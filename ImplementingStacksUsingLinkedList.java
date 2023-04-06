    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    
    ..................................................................................
    
    public class Stack {

    //Define the data members
    private Node head;
    private int size;


    public Stack() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        if(head == null){
            return true;
        }
        return false;
    }

    public void push(int element) {
        //Implement the push(element) function ; this push method pushes from the front of the LL so that
        //TimeComplexity remains O(1) 
        if(head == null){
            head = new Node(element);
            size++;
        }
        else{
            Node newNode = new Node(element);
            newNode.next = head;
            head = newNode;
            size++;
		}
    }

    public int pop() {
        //Implement the pop() function to perform pop operation just move the head to the next node 
        Node temp = head;
        if(isEmpty()){
            return -1;
		}
        if(head!=null){
            head = head.next;
            size--;
		}
        return temp.data;
    }

    public int top() {
        //Implement the top() function
        if(head==null){
            return -1;
        }
        return head.data;
    }

}
