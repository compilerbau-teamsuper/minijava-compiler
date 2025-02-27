public class methodTest {
    private static int plusOne(int x){return x + 1;}
    public void doNothing(){return;}
    int[] doubleAddOne(int x, int y){
        int[] res = {plusOne(x), plusOne(y)};
        return res;
    }
}
