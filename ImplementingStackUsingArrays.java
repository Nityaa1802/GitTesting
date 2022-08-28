public class StackUsingArrayImplementation {
    private int[] data;
    static int nextIndex; // for the top most index
    static int capacity;  // for the total size of the array

    public  StackUsingArrayImplementation(int sizeOfArray) {
        data = new int[sizeOfArray];
        nextIndex = 0;
        capacity = sizeOfArray;
    }

    // Tells How Many Elements Are Currently Present In The Stack
    public int size(){
        return nextIndex;  // last element index so it will return the no.of elements present in the array
                            // we will not use capacity becoz capacity tells the total size of the array or how much elemnts can
                           // come inside the stack not the actuall capacity of the stack
    }

    // Tells Whether the stack is Empty or not
    public boolean isEmpty(){
//        if(nextIndex==0){
//            return true;
//        }
//        return false;

        //Either check the above conditions or just return
        return nextIndex==0;
    }

    // pushes the element into the stack
    public void push(int element){

        // first check if the stack is empty or full
        if(nextIndex==capacity){
            System.out.println("Stack is full");
        }
        data[nextIndex] = element;
        nextIndex++;

    }

    public void pushDynamically(int element){
        if(nextIndex==capacity){
            int[] newData = new int[2*capacity];
            for(int i =0;i<capacity;i++){
                newData[i] = data[i];
            }
            capacity = capacity*2;
            data = newData;


        }
        data[nextIndex] = element;
        nextIndex++;
    }

    // deletes the top most element and returns it
    public int pop(){

        // first check whether the stack is empty or not
        if(isEmpty()){
            System.out.println(" POP method called , Stack is Empty");
        }
        else {
            nextIndex--;
        }
        return data[nextIndex];
    }

    // only returns the top most element
    public int top(){

        // first check whether the stack is empty or not
        if(isEmpty()){
            System.out.println("TOP method called , Stack is Empty");
        }
        return data[nextIndex-1];
    }


    public static void main(String[] args) {
        StackUsingArrayImplementation obj = new StackUsingArrayImplementation(5);
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.top());
        System.out.println(obj.size());
        //System.out.println(obj.pop());
        //System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.size());
        obj.push(40);
        obj.push(50);
        System.out.println(obj.top());
        System.out.println(obj.size());

        // obj.push(60); // this push will give error as the stack is full

        // the dynamic push will not provide error as here if the stack is full then it will increase the capacity of the array to double of the previous one
        obj.pushDynamically(60);
        obj.pushDynamically(70);
        obj.pushDynamically(80);
        System.out.println(obj.top());
        System.out.println(obj.size());


    }
}
