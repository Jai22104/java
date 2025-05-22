import java.util.*;

/* 

// to sind the length of String

public class Strings {

    public static void main(String[] args) {
        System.out.println("hello".length());
    }
}


// To find the uppercase and lowercase letters on String

public class Strings {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}


//  check wether the entered email is valid or not

//  in this equl.ignore is ignore the case problem like if we take 1 "Hello" and other "hello" then it will don't give an error


public class Strings {
    public static boolean check(String email){
        String db = "kanjariyaj66@gmail.com";
        return email.equals(db);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your email");
        String email = sc.nextLine();
        if(check(email)){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is not valid");
        } 
    }
}


// to reverse a string

public class Strings {

    public static void reverse(String s) {
        for(int i = s.length()-1; i>= 0; i --){
            System.out.print(s.charAt(i));
        }
        System.out.println();    
    }
    public static void main(String[] args) {
        String s = "Jai";
        reverse(s);
    }
}



// To print the character and index

public class Strings {
    public static void print(String s) {
        for(int i = 0; i < s.length(); i ++){
            System.out.println("Character at index " + i + " is " + s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "Jai";
        print(s);
    }
}


// to find the user's input is palindrome or not

public class Strings {

    public static boolean palindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(palindrome(s));
        sc.close();
    }
}
*/

// Find vowels and conconents in String

public class Strings {

    public static void findVowels(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel" + i + " is " + ch);
            }
            else {
                System.out.println("Consonent" + i + " is " + ch);
            }
        }
    }
    public static void main(String[] args) {
        // String s = "Jai";
        // findVowels(s);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = s.nextLine();
        findVowels(s1);
        s.close();
    }
}