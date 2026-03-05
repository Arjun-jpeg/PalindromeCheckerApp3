import java.util.Scanner;

class Uc6 {
    public void comp() {
        String input = "civic";
        Queue<Character> q = new LinkedList();
        Stack<Character> s = new Stack();
        for (int i = 0; i < input.length(); i++) {
            q.add(input.charAt(i));
            s.push(input.charAt(i));
        }

        boolean palin = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (q.remove() != s.pop()) { //0th index 'm' is compared with stack pops last index(4th) 'm'
                palin = false;
                break;
            }
        }
        if (palin) {
            System.out.println("Palindrome verified: " + input);
        } else {
            System.out.println("Not a Palindrome: " + input);
        }
    }
}
public class PalindromeCheckerApp3 {
    public static void main(String[] args) {
        Uc6 ob1 = new Uc6();
    }
}
