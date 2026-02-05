import java.util.Scanner;

class Customer {
    int cust_id;
    String name;
    String phone_no;
    int bill_no;
    int no_of_calls;
    double bill_amount;

    // parameterized constructor
    Customer(int cid, String n, String p, int bno, int calls) {
        cust_id = cid;
        name = n;
        phone_no = p;
        bill_no = bno;
        no_of_calls = calls;
        bill_amount = 0;
    }

    // method to calculate bill amount
    void calculate_bill_amt() {
        if (no_of_calls <= 100)
            bill_amount = 100;
        else if (no_of_calls <= 150)
            bill_amount = 100 + (no_of_calls - 100) * 0.60;
        else if (no_of_calls <= 200)
            bill_amount = 100 + (50 * 0.60) + (no_of_calls - 150) * 0.50;
        else
            bill_amount = 100 + (50 * 0.60) + (50 * 0.50)
                    + (no_of_calls - 200) * 0.40;
    }

    // display method
    void display() {
        System.out.println("customer id   : " + cust_id);
        System.out.println("name          : " + name);
        System.out.println("phone number  : " + phone_no);
        System.out.println("bill number   : " + bill_no);
        System.out.println("no of calls   : " + no_of_calls);
        System.out.println("bill amount   : " + bill_amount);
    }
}

class TelephoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of customers: ");
        int n = sc.nextInt();

        Customer[] c = new Customer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nenter details of customer " + (i + 1));

            System.out.print("customer id: ");
            int cid = sc.nextInt();

            System.out.print("name: ");
            String name = sc.next();

            System.out.print("phone number: ");
            String phone = sc.next();

            System.out.print("bill number: ");
            int bno = sc.nextInt();

            System.out.print("number of calls: ");
            int calls = sc.nextInt();

            c[i] = new Customer(cid, name, phone, bno, calls);
            c[i].calculate_bill_amt();
        }

        System.out.println("\ncustomer bill details");
        for (int i = 0; i < n; i++)
            c[i].display();

        sc.close();
    }
}

/*
 * $ java TelephoneBill
 * enter number of customers: 1
 *
 * enter details of customer 1
 * customer id: 101
 * name: ram
 * phone number: 1234567890
 * bill number: 5001
 * number of calls: 180
 *
 * customer bill details
 * customer id : 101
 * name : ram
 * phone number : 1234567890
 * bill number : 5001
 * no of calls : 180
 * bill amount : 145.0
 */
