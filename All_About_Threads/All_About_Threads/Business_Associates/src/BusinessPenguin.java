import java.util.concurrent.Semaphore;

public class BusinessPenguin {
    String name;
    int balance;
    BusinessPenguin partner;

    Semaphore semaphore1 = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(1);

    public BusinessPenguin(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void setPartner(BusinessPenguin partner) {
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void sellFish(int price) {

        //The problem arieses here when i'm trying to increase my balance and at the same time my partner is trying also to increase my balance.

try {

    semaphore2.acquire();
    partner.balance = partner.balance + price / 2;
    semaphore1.release();

    semaphore1.acquire();
    this.balance = this.balance + price / 2;
    semaphore2.release();
}catch (Exception e){
    System.out.println("Something went wrong!");
}



        //   throw new RuntimeException("Not implemented");
    }
}
