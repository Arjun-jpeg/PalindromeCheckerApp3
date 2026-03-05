import java.util.Scanner;

class Uc4 {
    String name2;
    public void arraycheck(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string you want to check with array: ");
        name2=input.nextLine();
        char[] arr=name2.toCharArray();
        boolean palin=true;
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                palin=false;
                break;
            }
            start++;
            end--;
        }
        if(palin){
            System.out.println("Palindrome verified: " +name2);
        }
        else{
            System.out.println("Not a Palindrome: " +name2);
        }
    }
}
public class PalindromeCheckerApp3 {
    public static void main(String[] args) {
        Uc4 ob1 = new Uc4();
    }
}
