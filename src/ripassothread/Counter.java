package ripassothread;

public class Counter implements Runnable
{
    Integer var = 0;
    Storage v1;
    public Counter(Storage var) 
    {
        this.v1=var;
    }

    
    
    public void run() 
    {		
        while(var < 9999)
        {
            count();
            v1.Add(var);
        }
    }
    
    public void count()
    {
        var++;
        System.out.println(var);
    }
}
