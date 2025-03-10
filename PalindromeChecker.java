import java.util.Scanner;

public class PalindromeChecker {
    // Attribute of the PalindromeChecker class
    private String text;

    // Constructor to initialize PalindromeChecker object
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        PalindromeChecker obj = new PalindromeChecker(text);
        obj.displayResult();
    }
}


/*
I/P -> Enter a text: abbac
O/P -> "abbac" is not a palindrome.
 */