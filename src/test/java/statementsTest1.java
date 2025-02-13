public class statementsTest1 {
    void forTest(){
        for (int i=0;i<5;i++){
            break;
        }
    }
    void whileTest(){
        boolean loopVar = true;
        while (loopVar){
            forTest();
            loopVar = false;
            continue;
        }
    }
}
