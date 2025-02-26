public class Demo {
    int x = 0; 

    public static void main(String[] args) {
        System.out.println(args[0]);
        Demo demo = new Demo();
        if (demo.isPrime(17)) {
            System.out.println("17 is prime!");
        }
        if (demo.isPrime(49)) {
            System.out.println("Uh-oh, 49 is prime?");
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
}