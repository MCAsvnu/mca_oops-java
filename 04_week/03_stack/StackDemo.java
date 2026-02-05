import java.util.Scanner;

class Stack {
    static int[] stack;
    static int top = -1;
    static int size;

    // constructor
    Stack(int n) {
        size = n;
        stack = new int[size];
    }

    static void push(int item) {
        if (top == size - 1) {
            System.out.println("stack overflow");
        } else {
            stack[++top] = item;
            System.out.println("element pushed");
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("stack underflow");
        } else {
            System.out.println("popped element: " + stack[top--]);
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println("stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter stack size: ");

        @SuppressWarnings("unused")
        Stack s = new Stack(sc.nextInt());

        int choice;
        System.out.println("\n1.push\n2.pop\n3.display\n0.exit");
        do {
            System.out.print("enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter element: ");
                    Stack.push(sc.nextInt());
                    break;

                case 2:
                    Stack.pop();
                    break;

                case 3:
                    Stack.display();
                    break;

                case 0:
                    System.out.println("exiting...");
                    break;

                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}

/*
 * $ java StackDemo
 * enter stack size: 3
 *
 * 1.push
 * 2.pop
 * 3.display
 * 0.exit
 *
 * enter choice: 1
 * enter element: 10
 * element pushed
 *
 * enter choice: 1
 * enter element: 20
 * element pushed
 *
 * enter choice: 3
 * stack elements:
 * 20
 * 10
 *
 * enter choice: 2
 * popped element: 20
 *
 * enter choice: 0
 * exiting...
 */
