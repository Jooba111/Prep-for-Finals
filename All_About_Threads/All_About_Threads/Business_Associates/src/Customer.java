public class Customer implements Runnable{
    BusinessPenguin salespenguin;


    public Customer(BusinessPenguin salesman) {
        this.salespenguin = salesman;
    }

    @Override
    public  void run() {
        for(int i=1; i<=5000; i++) {
            salespenguin.sellFish(2);
        }
    }
}
