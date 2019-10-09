package ripassothread;

public class Counter implements Runnable
{
    Integer var = 0;
    
    public void run() 
    {		
        count();
        Storage.Add(var);
    }
    
    public void count()
    {
        var++;
    }
}
