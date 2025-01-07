package Day_f_seven.Objects_and_methods;

public class Locking {
    public static void main(String[] args) {
        System.out.println("Object Level Locking");
        long obtime1=System.currentTimeMillis();
        SharedResource sr=new SharedResource();
        Thread t1=new Thread(()-> {sr.String("Java",5);});
        Thread t2=new Thread(()-> {sr.countdown(5);});
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        long obtime2=System.currentTimeMillis();
        System.out.println("Time Taken:"+(obtime2-obtime1));
        System.out.println("Class Level Locking");
        long cltime1=System.currentTimeMillis();
        Thread t3=new Thread(()-> {SharedResource.staticString("Java",5);});
        Thread t4=new Thread(()-> {SharedResource.staticcountdown(5);});
        t3.start();
        t4.start();
        try{
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        long cltime2=System.currentTimeMillis();
        System.out.println("Time Taken:"+(cltime2-cltime1));
    }
}
