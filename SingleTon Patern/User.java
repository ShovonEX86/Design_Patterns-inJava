public class User {
    private String uname;

    public User(String n){
        this.uname = n;
    }

    public void sendPrintjob(String doc){
        PrinterSpooler spooler = spooler.getInstance();
        System.out.println(uname + " sending a document!");
        spooler.printJob(doc);
    }
}