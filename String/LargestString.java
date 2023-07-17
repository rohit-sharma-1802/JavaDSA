public class LargestString {
    public static String largest(String strings[]) {
        String largest = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (largest.compareTo(strings[i]) < 0)
                largest = strings[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        String strings[] = { "rohit", "sharma" };
        System.out.println(largest(strings));
    }
}
