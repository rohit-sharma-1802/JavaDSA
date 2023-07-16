import java.util.*;

public class ArrayCreation {
    public static void update(int a[]) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static void main(String[] args) {
        int intArray[] = { 1, 2, 3, 4, 5, 6 };
        String strArray[] = { "Apple", "Mango", "Banana" };
        System.out.println(intArray.length + " - " + Arrays.toString(intArray));
        update(intArray);
        System.out.println(intArray.length + " - " + Arrays.toString(intArray));
        System.out.println(strArray.length + " - " + Arrays.toString(strArray));
    }
}