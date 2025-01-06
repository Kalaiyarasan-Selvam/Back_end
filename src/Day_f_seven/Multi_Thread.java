package Day_f_seven;

class Number extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Number: "+i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("NumberPrinter interrupted.");
            }
        }
    }
}
class Square extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Square: "+(i*i));
            try
            {
                Thread.sleep(700);
            }
            catch(InterruptedException e)
            {
                System.out.println("SquarePrinter interrupted.");
            }
        }
    }
}
public class Multi_Thread {
    public static void main(String[] args) {
        Number thread1=new Number();
        Square thread2=new Square();
        thread1.start();
        thread2.start();
        System.out.println("Thread started : ");
    }
}