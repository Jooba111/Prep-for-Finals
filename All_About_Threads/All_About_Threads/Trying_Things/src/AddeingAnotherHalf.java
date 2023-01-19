public class AddeingAnotherHalf  implements  Runnable{

   public volatile long x = 0;

   public  void run(){
       add();
   }

   public void add(){
       for(int i=500; i<=1000; i++){
           x += i;
       }
   }

}
