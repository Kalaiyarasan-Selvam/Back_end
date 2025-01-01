//Write a program with a class Counter that has a static variable to count the number of objects created. Create three o
// bjects and print the count using a static method

package Day_c_Three.Variables_and_Methods;

class Counter {
    private static int count = 0;


    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class CounterDemo {
    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Number of objects created: " + Counter.getCount());
    }
}
