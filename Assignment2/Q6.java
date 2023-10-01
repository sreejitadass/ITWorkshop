import java.util.Scanner;

public class Q6 {

    static String longestWord(String str) {
        str = str + " ";
        String word = "";
        String maxword = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                word = word + str.charAt(i);
            else {
                if (word.length() > maxword.length()) {
                    maxword = word;
                }
                word = "";
            }
        }
        return (maxword);
    }

    static boolean isPangram(String str) {
        str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int index = 0;
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            alphabet[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == false)
                flag = false;
        }
        return (flag);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();

        String maxword = longestWord(str);
        System.out.println("The longest word is: " + maxword);

        if (isPangram(str)) {
            System.out.println("The sentence is a pangram");
        } else {
            System.out.println("The sentence is not a pangram");
        }
        sc.close();

    }
}
