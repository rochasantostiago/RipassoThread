package ripassothread;

public class Printer implements Runnable{
    Storage p1 = new Storage();
    
    public void run() {  
         while(p1.getStore() < 9999)
        {
            System.out.println(p1.getStore());
        }
    }
}
