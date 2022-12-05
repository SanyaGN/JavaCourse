public class Main {
    public static void main(String[] args) {
        int a, b, c;
        a = 6;
        b = 9;
        c = 10;

        double d, e, f;
        d = 6d;
        e = 9d;
        f = 10d;

        //task 21
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        //task 22
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        //task 23
        if (a == 1 || b == 1 || c == 1) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        //task 24
        if (a == 2 && b ==2 && c != 2) {
            System.out.println(true);
        } else if (a == 2 && c == 2 && b != 2) {
            System.out.println(true);
        } else if (b == 2 && c == 2 && a != 2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        //task 25
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            System.out.println("y = 1");
        }
        else {
            System.out.println("y = 2");
        }

        //task 26
        if (a%2 == 0 || b%2 ==0 || c%2 == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("2");
        }

        //task 27
        if ((a > b && b > c) && (a - b) == (b - c)) {
            System.out.println(true);
        } else if ((c > b && b > a) && (c - b) == (b - a)) {
            System.out.println(true);
        } else if ((a > c && c > b) && (a - c) == (c - b)) {
            System.out.println(true);
        } else if ((b > c && c > a) && (b - c) == (c - a)) {
            System.out.println(true);
        } else if ((b > a && a > c) && (b - a) == (a - c)) {
            System.out.println(true);
        } else if ((c > a && a > b) && (c - a) == (a - b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //task 28
        if ((d > e && e > f) && (d - e) == (e - f)) {
            System.out.println(true);
        } else if ((f > e && e > d) && (f - e) == (e - d)) {
            System.out.println(true);
        } else if ((d > f && f > e) && (d - f) == (f - e)) {
            System.out.println(true);
        } else if ((e > f && f > d) && (e - f) == (f - d)) {
            System.out.println(true);
        } else if ((e > d && d > f) && (e - d) == (d - f)) {
            System.out.println(true);
        } else if ((f > d && d > e) && (f - d) == (d - e)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}