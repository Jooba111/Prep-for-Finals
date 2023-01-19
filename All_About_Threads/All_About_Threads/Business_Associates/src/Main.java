public class Main {
    public static void main(String[] args) throws InterruptedException {
        BusinessPenguin peter = new BusinessPenguin("Peter");
        BusinessPenguin paul = new BusinessPenguin("Paul");

        peter.setPartner(paul);
        paul.setPartner(peter);

        Customer petersCustomer = new Customer(peter);
        Customer paulsCustomer = new Customer(paul);


        Thread myth = new Thread(petersCustomer);
        Thread myth2 = new Thread(paulsCustomer);

        myth.start();
        myth2.start();


        myth.join();
        myth2.join();


        System.out.println(paul.getBalance() + " " + peter.getBalance());

        //System.out.println();



    }
}
