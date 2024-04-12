public class StringIsANumericRegex {
    public static void main(String[] args) {
        String str = "oiy";
        boolean numeric = true;
        numeric = str.matches("-?\\d+(\\.\\d+)?");
        if ((numeric)) {
            System.out.println("correct");
        } else {
            System.out.println("not correct");
        }
    }

}
