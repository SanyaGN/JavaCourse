public class Main {

    int arajin = 0;
    int hajord = 1;
    int tiv = 0;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.fibonacciNumber(10));
        main.fibonacciNumber1(10);
    }

    //  solved with recursion
    public int fibonacciNumber(int index) {
        if (index < 0) {
            System.out.println("Fibonacci number should be positive");
        } else if (index == 0) {
            tiv = 0;
        } else if (index == 1) {
            tiv = 1;
        } else {
            fibonacciNumber(index - 1);
            tiv = arajin + hajord;
            arajin = hajord;
            hajord = tiv;
        }
        return tiv;
    }

    // solved with for
    public void fibonacciNumber1(int index) {
        if (index == 0 || index == 1) {
            System.out.println("1");
        } else if (index > 0) {
            int[] arrayFibonacci = new int[index + 1];
            arrayFibonacci[0] = 0;
            arrayFibonacci[1] = 1;
            for (int i = 2; i < arrayFibonacci.length; i++) {
                arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
            }
            System.out.println(arrayFibonacci[index]);
        } else {
            System.out.println("Fibonacci number should be positive");
        }
    }
}