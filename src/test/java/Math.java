public class Math {
    static final float pi = 3.14f; 

    public int facRec(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * facRec(n - 1);
        }
    }
    public int facImp(int n) {
        int res = 1;
        for(int i = n; i > 1; i--) {
            res *= i;
        }
        return res;
    }
    static float circleArea(float radius) {
        return pi * radius * radius;
    }
}