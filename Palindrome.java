public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 101; 
        while (num != Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())) {
            num++;
        }
        System.out.println("Palindrome: " + num);
    }
}

