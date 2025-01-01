//Create two interfaces Printer with a method print() and Scanner with a method scan().
// Create a class AllInOne that implements both interfaces.

package Day_c_Three.Interface2;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOne implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class AllInOneTest {
    public static void main(String[] args) {
        AllInOne allInOne = new AllInOne();
        allInOne.print();
        allInOne.scan();
    }
}

