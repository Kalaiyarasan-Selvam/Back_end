package Additional.Utilities;

public class Container <T>{
    private T n;
    public Container(T n)
    {
        this.n=n;
    }
    public T getValue()
    {
        return n;
    }
    public void setValue(T n)
    {
        this.n=n;
    }
    @Override
    public String toString(){
        return "Container{Value= "+n+"}";
    }
}
