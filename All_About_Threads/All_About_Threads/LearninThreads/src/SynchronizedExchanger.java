public class SynchronizedExchanger {

    protected Object object = null;

    public synchronized void setObject(Object o)
    {
        this.object = o;
    }

    public synchronized Object getObject()
    {
        return this.object;
    }


    //Keyword synchronized and synchronized blocks are the same.

    public synchronized void setObj(Object o)
    {
        synchronized (this) {this.object = o;}
    }

    public synchronized Object getObj()
    {
        synchronized (this){return this.object;}   //monitor objects.
    }


}
