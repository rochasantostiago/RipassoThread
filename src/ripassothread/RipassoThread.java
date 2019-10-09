package ripassothread;

public class RipassoThread 
{
    public static void main(String[] args) 
    {
        Runnable CountThread = new Counter();
        Thread Thread1 = new Thread (CountThread);
        Thread1.start();
    }
}
