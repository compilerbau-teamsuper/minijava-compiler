public class statementsTest1 {
    void forTest(){
        for (int i=0;i<5;i++){
            i -= 1;
            break;
        }
    }
    void whileTest(){
        boolean loopVar = true;
        while (loopVar){
            forTest();
            loopVar &= false;
            continue;
        }
    }
}
