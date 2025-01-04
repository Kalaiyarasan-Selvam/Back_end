package Java_Lang_Classes;

public class Java_langClass {
    public static void main(String[] args) {
        double n=25.0;
        double sqrt=Math.sqrt(n);
        double power=Math.pow(n,2);
        double max=Math.max(10,20);
        System.out.println("Math class demonstration:");
        System.out.println("Square root of "+n+" is "+sqrt);
        System.out.println(n+" raised to the power of 2 is "+power);
        System.out.println("Maximum of 10 and 20 is "+max);
        System.out.println();

        String s="Core Java";
        int length=s.length();
        String upperCaseStr=s.toUpperCase();
        String sub=s.substring(5);
        System.out.println("String class demonstration:");
        System.out.println("Original string: "+s);
        System.out.println("Length of the string: "+length);
        System.out.println("Uppercase string: "+upperCaseStr);
        System.out.println("Substring from index 7: "+sub);
        System.out.println();

        System.out.println("System class demonstration:");
        System.out.println("Printing a message to the console.");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int temp = i * i;
        }
        long endTime=System.currentTimeMillis();
        long executionTime=endTime-startTime;
        System.out.println("Execution time of the loop: "+executionTime+" milliseconds");
    }
}
