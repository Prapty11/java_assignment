import java.util.Scanner;

public class ipaddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String ip = input.nextLine();

        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            System.out.println("Invalid IP");
            return;
        }

        boolean isValid = true;

        for (int i = 0; i < 4; i++) {
            String part = parts[i];

            if (!part.matches("\\d+")) {
                isValid = false;
                break;
            }

            int num = Integer.parseInt(part);

            if (num < 0 || num > 255) {
                isValid = false;
                break;
            }

            if (i == 0) {
                if (part.startsWith("0") || part.length() == 1) {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid) {
            System.out.println("Valid IP address");
        } else {
            System.out.println("Invalid IP address");
        }

        input.close();
    }
}
