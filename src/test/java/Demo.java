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
        demo.fib(gotX);
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

    void fib(int n) {
        int length = n + 1;
        int[] fibNumbers = new int[length];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        for (int i = 2; i < length; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }

        System.out.println("Fibonacci numbers:");
        for (int i = 0; i < length; i++) {
            System.out.println(
                "" + fibNumbers[i]
            );
        }
    }
}