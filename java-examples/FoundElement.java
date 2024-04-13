public class FoundElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                result = true;
            }
        }
        if (result) {
            System.out.println("we got that element");

        } else {
            System.out.println("element not found");
        }
    }
}
