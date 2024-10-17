import java.util.Arrays;

public class GenericSorter<T extends Comparable<T>> {
    private T[] values;

    public GenericSorter(T[] values) {
        this.values = values;
    }

    public void sort() {
        Arrays.sort(values);
    }

    public void display() {
        for (T value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 4, 1, 5, 9};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        intSorter.sort();
        System.out.print("Sorted Integers: ");
        intSorter.display();

        String[] strArray = {"Apple", "Orange", "Banana", "Pineapple"};
        GenericSorter<String> strSorter = new GenericSorter<>(strArray);
        strSorter.sort();
        System.out.print("Sorted Strings: ");
        strSorter.display();
    }
}
