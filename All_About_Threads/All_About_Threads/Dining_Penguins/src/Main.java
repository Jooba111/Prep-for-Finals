public class Main {
    public static void main(String[] args) {


        Table table = new Table(4);

        Penguin peter = new Penguin("peter", table);
        Penguin paul = new Penguin("paul", table);
        Penguin pam = new Penguin("pam", table);
        Penguin paula = new Penguin("paula", table);

        Thread petersThread = new Thread(peter);
        Thread paulsThread = new Thread(paul);
        Thread pamsThread = new Thread(pam);
        Thread paulasThread = new Thread(paula);

        petersThread.start();
        paulsThread.start();
        pamsThread.start();
        paulasThread.start();


        try {
            petersThread.join();
            paulsThread.join();
            pamsThread.join();
            paulasThread.join();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong. Interrupted!");
            return;
        }



    }
}