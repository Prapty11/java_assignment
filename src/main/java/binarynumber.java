import java.util.Scanner;

public class binarynumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        boolean isBinary = true;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }

        if (isBinary) {
            System.out.println("The string is a binary number.");
        } else {
            System.out.println("The string is NOT a binary number.");
        }

        input.close();
    }
}
