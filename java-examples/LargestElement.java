public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 9, 2, 8, 1, 7 };
        int greatest = arr[0];

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }

        }
        System.out.println(greatest);

    }
}
