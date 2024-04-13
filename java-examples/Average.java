public class Average {
    public static void main(String[] args) {
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        double Average = sum / (numArray.length);
        System.out.println("Average of array is : " + Average);

    }
}
