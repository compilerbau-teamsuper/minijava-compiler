public class Demo {
    int x = 42; 

    public static void main(String[] args) {
        System.err.println("Hello, " + "world!");

        System.out.println("Passed argument: " + args[0]);

        Demo demo = new Demo();
        if (demo.isPrime(17)) {
            System.out.println("17 is prime!");
        }
        if (demo.isPrime(49)) {
            System.out.println("Uh-oh, 49 is prime?");
        }
        demo.setX(7);
        int gotX = demo.getX();
        int[] fibs = demo.fib(gotX);

        System.out.println("" + demo.conversions());
    }

    //inefficient :)
    boolean isPrime(int n) {
        if (n <= 2) return true;
        for(int i = 2; i < n; i++) {
            if ((n % i) == 0) return false;
        }
        return true;
    }

    void setX(int value) {
        x = value;
    }

    int getX() {
        return x;
    }

    int[] fib(int n) {
        int length = n + 1;
        int[] fibNumbers = new int[length];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        int i = 2;
        while(i < length) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
            i++;
        }
        
        for (int j = 0; j < length; j++) {
            System.out.println(
                "Fibonacci number " + j + " is " + fibNumbers[j]
            );
        }

        return fibNumbers;
    }

    double conversions() {
        float f = 3.5f;
        long l = 2L;
        double d = 4.2d;
        char c = 4;
        short s = 5;
        byte b = 1;

        return f + l + d + c + s + b;
    }
}