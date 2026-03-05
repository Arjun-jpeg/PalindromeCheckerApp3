import java.util.Scanner;

class Uc3 {
    String beforerev;


    public void reverse() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a palindrome string to reverse it and verify: ");

        beforerev = input.nextLine();
        for (int i = beforerev.length() - 1; i >= 0; i--) {
            afterrev = afterrev + beforerev.charAt(i);
        }
        if (afterrev.equals(beforerev)) {

            beforerev = input.nextLine();

            StringBuilder afterrev = new StringBuilder();

            for (int i = beforerev.length() - 1; i >= 0; i--) {
                afterrev.append(beforerev.charAt(i));
            }

            if (afterrev.toString().equals(beforerev)) {

                System.out.println("Palindrome verified");
                System.out.println("Before: " + beforerev);
                System.out.println("After reverse: " + afterrev);
            } else {
                System.out.println("Palindrome not verified, before cannot be equal to after");
            }
        }
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Uc3 ob1 = new Uc3();
    }
}
