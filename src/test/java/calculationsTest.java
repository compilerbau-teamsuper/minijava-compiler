public class calculationsTest {
    boolean f = true || false;
    boolean g = !f ^ alwaysTrue() != true == 5 < 4;
    int x = -(alwaysOne() - 5 * 2 / 4 + 3);

    boolean alwaysTrue(){
        return true && true;
    }
    int alwaysOne(){
        return 1;
    }

}
