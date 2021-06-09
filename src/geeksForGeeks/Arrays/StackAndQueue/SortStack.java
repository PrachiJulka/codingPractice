package geeksForGeeks.Arrays.StackAndQueue;

public class SortStack {

    static Stack sortStack(Stack stack,Stack stack1) {
      //  System.out.println(stack.peek());
        if (stack.top == null) {
            System.out.println("hey");
            return stack1;
        } else {
            int temp = stack.pop();
            while (stack1.top != null && stack1.peek() > temp) {
                stack.push(stack1.pop());
            }
            stack1.push(temp);
//            System.out.println("d"+stack1.peek());
        }
        return sortStack(stack,stack1);
    }

    public static void main(String[] args) {
       /* Stack stack = new Stack();
        Stack stack1=new Stack();
        stack.push(12);
        stack.push(1);
        stack.push(23);
        stack.push(3);
        System.out.println(stack.peek());
        sortStack(stack,stack1);

        while(stack1.top!=null){
            System.out.println(stack1.pop());
        }*/

       StackWithMin stackWithMin=new StackWithMin();
        System.out.println(stackWithMin.getMin());
        stackWithMin.push(-2);
        stackWithMin.push(0);
        stackWithMin.push(-3);
        System.out.println(stackWithMin.getMin());
        stackWithMin.pop();
        System.out.println(stackWithMin.top);
        System.out.println(stackWithMin.getMin());
        //System.out.println(stack1.peek());

    }

}
