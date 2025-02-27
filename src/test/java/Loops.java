class Loops {
    int whileLoop() {
        int i = 21;
        int res = 0;
        while(res != 41) {
            res += i;
            i--;
        }
        return res;
    }   

    int forLoop() {
        int res = 0;
        for(int i = 21; res != 41; i--) {
            res += i;
        }
        return res;
    }
}