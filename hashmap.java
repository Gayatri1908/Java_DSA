import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class hashmap {

 // 1.hashmap of capitals
        public static void capital(){
            HashMap<String,String>capitals= new HashMap<>();
            capitals.put("Odisha", "Bhubaneswar");
            capitals.put("Karnataka", "Bengluru");
            capitals.put("Moharastra", "Mumbai");
            System.out.println(capitals.get("Odisha"));

            for(String capital:capitals.keySet()){
                System.out.println(capitals.get(capital));
            }
            for(String capital:capitals.values()){
                System.out.println(capital);
            }
            for(Map.Entry<String,String>entry:capitals.entrySet()){
                System.out.println("State="+entry.getKey()+"capital="+entry.getValue());
            }
        }

// 2.counting letter
        public static void counting(){
           String text= "hello guys hello";
           String[] arr= text.split(" ");

           HashMap<String,Integer> countword=new HashMap<>();
           for(String words: arr){
            countword.put(words, countword.getOrDefault(words, 0)+1);
           }

           System.out.println(countword);
        }


// 3.Student Database
        public static void StudentDB(){
            HashMap<Integer,String> students= new HashMap<>();
            students.put(148, "Durga");
            students.put(149, "Elora");
            students.put(150, "Gayatri");
            students.put(151, "Girija");

            int searchid= 149;
            if(students.containsKey(searchid)){
                System.out.println("Student Found:"+students.get(searchid));
            }
            else{
                System.out.println("Student not found");
            }
        }

//Hash set example
        public static void hashsetex(){
            HashSet<String> fruit=new HashSet<>();
            fruit.add("Apple");
            fruit.add("Banana");
            fruit.add("Kiwi");

            System.out.println(fruit);
            System.out.println(fruit.size());

            if(fruit.contains("Apple")){
                System.out.println("Apple is present");
            }
            
            fruit.remove("Banana");
            System.out.println("After removal:"+fruit);
        }
//Student Grade Manager
        public static void studentsgrage(){
            HashMap<String,Integer>gradecount=new HashMap<>();
            gradecount.put("Gayatri",50 );
            gradecount.put("Rakhi",80 );
            gradecount.put("Raj",60 );
            gradecount.put("Rimi",94 );
            //adding new student 
            gradecount.put("Elora",76 );
            //updating
            gradecount.put("Gayatri", 78);
            //finding heighest grades
            int highest=-1;
            String topStudent=" ";
            for (Map.Entry<String, Integer> entry : gradecount.entrySet()) {
                if (entry.getValue() > highest) {
                    highest = entry.getValue();
                    topStudent = entry.getKey();
                System.out.println("Highest Grade: " + highest + " by " + topStudent);
        }
    }

    // Display students with grade above 80
        System.out.println("Students scoring above 80:");
        for (Map.Entry<String, Integer> entry : gradecount.entrySet()) {
            if (entry.getValue() > 80) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
//character frequency in String
    public static void countEachChar(){
           String text= "hello guys hello";
           String[] arr= text.split(" ");

           HashMap<String,Integer> countword=new HashMap<>();
           for(String words: arr){
            countword.put(words, countword.getOrDefault(words, 0)+1);
           }

           System.out.println(countword);
        }

    //Find Most Frequent Vowel and consonant
    public static void freq(){
        String Word="Sus";
        Word=Word.toLowerCase();
        int n= Word.length();
        int maxconst=0;
        int maxvwl=0;
        
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> consonant = new HashMap<>();
        

        for(Character ch:Word.toCharArray() ){
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel.put(ch, vowel.getOrDefault(ch, 0)+1);
                    if(vowel.get(ch)>maxvwl){
                        maxvwl=vowel.get(ch);
                    }
                }
                else{
                    consonant.put(ch, consonant.getOrDefault(ch, 0)+1);
                    if(consonant.get(ch)>maxconst){
                        maxconst=consonant.get(ch);
                    }
                }
            }
    }
        System.out.println("Most frequent vowel(s):");
        for(Map.Entry<Character,Integer> entry:vowel.entrySet()){
            if(entry.getValue()==maxvwl){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }

        System.out.println("Most frequent consonant(s):");
        for(Map.Entry<Character,Integer> entry:consonant.entrySet()){
            if(entry.getValue()==maxconst){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
//Number of Good pair
    public static int NumGoodPair(int[] num){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i:num){
            count+=map.getOrDefault(i, 0);
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        return count;

    }


    public static void main(String[] args) {

    HashMap<Integer,String> student1= new HashMap<>();
            

    // frequencycount();

    // capital();

    // counting();

   // hashsetex();

   // studentsgrage();

   freq();

  System.out.println(NumGoodPair(new int[]{1,2,1,3,1,3}));
   

    }
}
