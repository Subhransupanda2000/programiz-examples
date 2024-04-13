import java.util.Arrays;

public class ConcatinationOfTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 4, 5, 6 };
        int result[] = new int[arr1.length + arr2.length];
        int pos = 0;
        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(result));

    }
}
