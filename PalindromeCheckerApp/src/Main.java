import java.util.Scanner;

class Uc5 {
    String name;
    public void stack() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to check using Stack: ");
        name = input.nextLine();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<name.length();i++){
            stk.push(name.charAt(i)); //pushes madam from 0 to 4 into stack
        }
        boolean palin=true;
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=stk.pop()){ //0th index 'm' is compared with stack pops last index(4th) 'm'
                palin=false;
                break;
            }
        }
        if(palin){
            System.out.println("Palindrome verified: " +name);
        }
        else{
            System.out.println("Not a Palindrome: " +name);
        }
    }
}
public class PalindromeCheckerApp3 {
    public static void main(String[] args) {
        Uc5 ob1 = new Uc5();
    }
}
