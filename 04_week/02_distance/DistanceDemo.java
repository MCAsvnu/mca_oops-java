import java.util.Scanner;

class Points {
    double x, y;

    // constructor
    Points(double x1, double y1) {
        x = x1;
        y = y1;
    }

    // distance using coordinates
    double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    // distance using object
    double distance(Points p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class DistanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter coordinates of p1: ");
        Points p1 = new Points(sc.nextDouble(), sc.nextDouble());

        System.out.print("enter coordinates of p2: ");
        Points p2 = new Points(sc.nextDouble(), sc.nextDouble());

        System.out.print("enter coordinates of p3: ");
        Points p3 = new Points(sc.nextDouble(), sc.nextDouble());

        System.out.print("p1 = ");
        p1.display();
        System.out.print("p2 = ");
        p2.display();
        System.out.print("p3 = ");
        p3.display();

        System.out.println("distance between p1 and p2 = "
                + p1.distance(p2.x, p2.y));

        System.out.println("distance between p1 and p3 = "
                + p1.distance(p3));

        sc.close();
    }
}

/*
 * $ java DistanceDemo
 * enter coordinates of p1: 2 3
 * enter coordinates of p2: 1 4
 * enter coordinates of p3: 3 5
 * p1 = (2.0, 3.0)
 * p2 = (1.0, 4.0)
 * p3 = (3.0, 5.0)
 * distance between p1 and p2 = 1.4142135623730951
 * distance between p1 and p3 = 2.23606797749979
 */
