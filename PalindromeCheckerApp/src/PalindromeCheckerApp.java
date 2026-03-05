import java.util.ArrayDeque;
import java.util.Deque;

class Uc7 {
    public void que() {
        String input = "refer";
        Deque<Character> q = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            q.add(input.charAt(i));
        }

        boolean palin = true;
        while(q.size()>1) {
            char front=q.removeFirst();
            char rear=q.removeLast();
            if(front!=rear) {
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
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Uc7 ob = new Uc7();
        ob.que();
    }
}
