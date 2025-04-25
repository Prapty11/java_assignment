import java.util.Scanner;

public class stringanalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[] words = text.split(" ");
        int wordCount = words.length;

        String noSpaces = text.replace(" ", "");
        int charCount = noSpaces.length();

        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
    }

        }
        System.out.println("Words: " + wordCount);
        System.out.println("Characters (no spaces): " + charCount);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        input.close();
    }
}