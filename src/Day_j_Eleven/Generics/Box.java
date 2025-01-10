package Day_j_Eleven.Generics;

public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printItem() {
        System.out.println("Stored Item: " + item);
    }

    public boolean isItemOfType(Class<?> clazz) {
        return clazz.isInstance(item);
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(100);
        integerBox.printItem();
        System.out.println("Is item of type Integer? " + integerBox.isItemOfType(Integer.class));

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, World!");
        stringBox.printItem();
        System.out.println("Is item of type String? " + stringBox.isItemOfType(String.class));

        Box<CustomClass> customBox = new Box<>();
        customBox.setItem(new CustomClass("Custom Object"));
        customBox.printItem();
        System.out.println("Is item of type CustomClass? " + customBox.isItemOfType(CustomClass.class));
    }
}

class CustomClass {
    private String name;

    public CustomClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomClass: " + name;
    }
}

