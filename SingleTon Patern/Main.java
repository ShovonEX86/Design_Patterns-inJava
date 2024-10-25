public class Main {
    public static void main(String[] args){
        User u1 = new User("Alice");
        User u2 = new User("Bob");

        u1.sendPrintjob("Document1.pdf");
        u2.sendPrintjob("Document2.pdf");
    }
}