import java.util.Scanner;

public class pracString {
//reverse the string
    public static void rev(){
        String  str= "Nayan";
        String rev=" ";
        for(int i=str.length()-1;i>0;i--){
            rev +=str.charAt(i);

        }
        System.out.println(rev);
    }
//paliendrom
    public static void palinendrom(){
        String  str= "Nayan";
        String rev=" ";
        for(int i=str.length()-1;i>0;i--){
            rev +=str.charAt(i);

        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
////count the number of vowel and consonant
     public static void vowelcount(){
        String s1="GayatriKalapahada";
        s1=s1.toLowerCase();
        int vowel=0;
        int conso=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch =='a' || ch =='e'|| ch =='i'|| ch=='o'|| ch=='u'){
                vowel++;
            }
            else{
                conso++;
            }

        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + conso);
    }
    //Convert String to Uppercase to lowercase and viceversa
    public static void toupperandlower(){
       
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();       
        String upper = str.toUpperCase();

        String lower = str.toLowerCase();

        System.out.println("Original String: " + str);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        sc.close();
    }
    //Count the Total Number of Words in a Sentence 
    public static void countword(){
        String str1="G ay atri ";
        System.out.println(str1);
        int word=0;
        char[] arr=str1.toCharArray();
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=' '){
                word++;
           }
          
        }
         System.out.println(word);
        }

    //Compare Two Strings Without Using equals() Method
    public static void equal(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not equal.");
        } else {

            boolean isEqual = true;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual)
                System.out.println("Strings are equal.");
            else
                System.out.println("Strings are not equal.");
        }

        sc.close();
    }
// Find the Length of a String Without Using length() 
    public static void StringLength(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;


        for (char c : str.toCharArray()) {
            count++;
        }

        System.out.println("Length of the string: " + count);

        sc.close();
    }
    //Replace All Spaces with Hyphens Write a program that replaces all spaces in a given sentence
//with hyphens (-).
    public static void replacevoidspace(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String replaced = str.replace(' ', '-');

        System.out.println("Modified sentence: " + replaced);

        sc.close();
    }
    // check whether a given string consists only of numeric characters.
public static void numericval(){
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        boolean isNumeric = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                isNumeric = false;
                break;
            }
}
        if (isNumeric)
            System.out.println("The string contains only numeric characters.");
        else
            System.out.println("The string contains non-numeric characters.");

        sc.close();
}
//Concatenate Two Strings Without Using + Operator Write a Java program to concatenate two strings without using the + operator.
public static void concat(){
     Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        
        String result = str1.concat(str2);
        
        System.out.println("Concatenated String: " + result);
        
        sc.close();
}    

//find the highest frequency of a string
public static void highestfreq(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; 

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        char maxChar = str.charAt(0);
        int maxFreq = freq[maxChar];

        // Find the character with highest frequency
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Character with highest frequency: '" + maxChar + "'");
        System.out.println("Frequency: " + maxFreq);
    }
//reverse of each word in a given string   
public static void reverseeachword(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" "); // split into words
        String result = "";

        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            result += reversed + " ";
        }

        System.out.println("Reversed each word: " + result.trim());

    }
//remove duppliczte in string
public static void removedup(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) { // check if not already present
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
public static void main(String[] args) {
       // vowelcount();
      // toupperandlower();
      //  countword();
       // equal();
      // StringLength();
      //replacevoidspace();
        //numericval();
       // concat();
      // highestfreq();
     // reverseeachword();
     removedup();
    }
}
