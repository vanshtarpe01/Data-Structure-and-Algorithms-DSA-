public class ReverseString {

    public static String reverse(String str) {
        if (str == null)
            return "Enter a String....";
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();

    }

    public static void main(String[] args) {
        String str = "Vansh";
        System.out.print("Length of String : " + str.length());
        System.out.println("Reversed : " + reverse(str));
    }
}