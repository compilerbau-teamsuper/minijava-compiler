public class Demo {
    int x = 7; 

    public static void main(String[] args) {
        System.out.println(args[0]);
        Demo demo = new Demo();
        if (demo.isPrime(17)) {
            System.out.println("17 is prime!");
        }
        if (demo.isPrime(49)) {
            System.out.println("Uh-oh, 49 is prime?");
        }
        int gotIt = demo.getX();
        if (demo.fib(gotIt) == 13) {
            System.out.println("Right fib number!");
        }
    }

    //inefficient :)
    boolean isPrime(int n) {
        if (n <= 2) return true;
        for(int i = 2; i < n; i++) {
            if ((n % i) == 0) return false;
        }
        return true;
    }

    int getX() {
        return x;
    }

    int fib(int n) {
        int length = n + 1;
        int[] fibNumbers = new int[length];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        for (int i = 2; i < length; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }
        return fibNumbers[length - 1];
    }
}