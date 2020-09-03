public class Main{
    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new Queue();

        int[] arr = {3, 6, 8, 12, 13, 15};

        for(int a : arr){
            s.push(a);
            q.add(a);
        }

        System.out.println("Stack: ");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        System.out.println("\nQueue: ");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
