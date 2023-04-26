import java.util.Scanner;
import java.util.Stack;

class Special_Stack extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();
    void push(int x) {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        } else {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }
    public Integer pop() {
        int x = super.pop();
        min.pop();
        return x;
    }

    int getMin() {
        int x = min.pop();
        min.push(x);
        return x;
    }
    public static void main(String[] args) {
        int num;
        String exit;
        Scanner sc=new Scanner(System.in);
        Special_Stack s = new Special_Stack();
            while(true) {
                System.out.println("enter the number=");
                num = sc.nextInt();
                s.push(num);
                System.out.println("If want to quit enter =(YES)");
                exit = sc.next();
                if ("YES".equalsIgnoreCase(exit))
                    break;
            }
        System.out.println(s.getMin());
    }
}
