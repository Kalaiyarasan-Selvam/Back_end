package Day_f_seven.Objects_and_methods;

public class SharedResource {

    public synchronized void String(String word,int count){
        for(int i=0;i<count;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+word);
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
    public synchronized void countdown(int num){
        for(int i=num;i>0;i--)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
    public static synchronized void staticString(String word,int count){
        for(int i=0;i<count;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+word);
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
    public static synchronized void staticcountdown(int num){
        for(int i=num;i>0;i--)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}
