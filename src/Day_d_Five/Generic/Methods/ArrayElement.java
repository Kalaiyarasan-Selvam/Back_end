package Generic.Methods;
public class ArrayElement {
    public static <T> void printArray(T[] array) {
        for (T element:array) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] stringArr={"Welcome","To","The","World"};
        System.out.print("String array:");
        printArray(stringArr);
        Integer[] integerArr={1,2,3,4,5};
        System.out.print("Integer array:");
        printArray(integerArr);
        Double[] doubleArr={1.5,2.9,3.7,4.8,5.6};
        System.out.print("Double array:");
        printArray(doubleArr);
    }
}

