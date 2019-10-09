package ripassothread;

public class RipassoThread 
{
    public static void main(String[] args) 
    {
        Storage store = new Storage();
        Runnable CountThread = new Counter(store);
        Thread Thread1 = new Thread (CountThread);
        Thread1.start();
        
        Runnable PrinterThread = new Printer();
        Thread ThrPrint = new Thread (PrinterThread);
        ThrPrint.start();
    }
}
