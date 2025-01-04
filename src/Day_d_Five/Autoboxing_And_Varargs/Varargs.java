package Autoboxing_And_Varargs;

public class Varargs {
    public static int sumvarargs(int...num)
    {
        int s=0;
        for(int i:num)
            s+=i;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 5 numbers:"+sumvarargs(1,2,3,4,5));
        System.out.println("Sum of 3 numbers:"+sumvarargs(1,2,3));
        System.out.println("Sum of 2 numbers:"+sumvarargs(1,2));
    }
}
