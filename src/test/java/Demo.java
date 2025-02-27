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
        
        for (int j = 0; j < fibNumbers.length; j++) {
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

        // Boxing conversions work:
        Float boxedf = f;
        f = boxedf;

        // and unboxing works, too:
        double promoted = boxedf + b; 
        System.out.println("value of promoted is:");
        System.out.println(promoted);
        System.out.println("oh, and by the way, that was an example of method selection ;-)");
        System.out.println("and that was too...");
        System.out.println("this should call the overloaded method that takes a double, even though we pass a Float:");
        overloaded(boxedf);

        Object demo = new Demo();
        System.out.println("even object casting works: " + demo);

        return f + l + d + c + s + b;
    }

    void overloaded(double val) {
        System.out.println("overloaded called with double " + val);
    }

    void overloaded(String val) {
        System.out.println("overloaded called with String " + val);
    }
}
