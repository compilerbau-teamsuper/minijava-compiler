public class arrayTest {
    int[] numbers = {1,2,3};
    String[] mail = new String[3];

    String[] makeMail(){
        String[] mailref = mail;
        mailref[0] = "Servus";
        mailref[1] = "nix";
        mailref[2] = mailref[0];
        return mailref;
    }
}
