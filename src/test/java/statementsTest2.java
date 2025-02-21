public class statementsTest2 {
    void ifTest(){
        if (5 >= 4){
            {}
        }
        else {
            if (true) {
                return;
            }
        }
    }
    void assignmentTest(){
        boolean b;
        b = true;
        b |= false;
        int x = 1;
        x *= 4;
        x %= 2;
    }
}
