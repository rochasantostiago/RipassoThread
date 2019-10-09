package ripassothread;

public class Storage 
{
    Integer store=0;

    public Storage() {
    }

    public Storage(Integer value) {
        this.store = value;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }
    
    
    public void Add(Integer value) {
        this.store = value;
        //System.out.println(store);
    }
}