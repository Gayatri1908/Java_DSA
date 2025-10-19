import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class pracArray {
//sum and avg of elements in array
    public static void sumavg(){
        int[] arr={1,2,3,4,5};
        int sum=0;
        int avg=0;
        for(int i=0;i<=arr.length;i++){
            sum=sum+i;
            
        }
        avg=(sum/arr.length);
        System.out.println(avg);
        System.out.println(sum);
    }

//count even odd number in array
     public static void evenodd(){
        int[] arr={0,7,2,3,4,5};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
            
        }
        System.out.println(even);
        System.out.println(odd);
     }

//reverse an array
     public static void rev(){
        int[] arr={0,1,2,3,4,5};
        int rev=0;
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
     }

//frequency of each elements in array
     public static void freq(){
        int[] arr={1,2,3,4,1,26,4,6,32,5,32};
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num:arr){
           freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
             System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
//copy one array to anothe (deep copy)
        public static void deepcopy(){
            int[] arr={10,20,30,40};
            int[] arr1= new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];

            arr1[1]=98; 
           System.out.println(arr1[i]+""); 
		   System.out.println(arr1[i]+"");

            //System.err.println(arr1);
        }
    }
//move all zeros to end of array
        
            public static void move() {
            int[] arr1={1,0,0,1,0,1,0,1,0,1};
			int n=arr1.length;
			int zero=0;
			for(int i=0;i<n;i++) {
				if(arr1[i]==0) {
					zero++;
				}
			}
				for(int i=0;i<n;i++) {
					if(i<zero) {
						arr1[i]=0;
						
					}
					else {
						arr1[i]=1;
					}
				}
             System.out.println(Arrays.toString(arr1));
        }

//how many times a number appears in an array
public static void appear(){
    int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 0, 1};
    int key = 0; 
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) {
            count++;
            System.out.println("Element " + key + " found at index: " + i);
        }
    }

    System.out.println("Element " + key + " occurred " + count + " times.");        
}

//find the 1st repeated element
public static void firstRepet() {
    int[] arr = {3, 5, 2, 4, 5, 3, 2};  
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.println("First repeated element: " + arr[i]);
                found = true;
                return; 
            }
        }
    }

    if (!found) {
        System.out.println("No repeated elements found");
    }
}
//remove dupplicate element from sorted array
   public static void remodup(){
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int n = arr.length;

        int newLength = removeDuplicates(arr, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) return n;

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

     
        arr[j++] = arr[n - 1];

        return j;
    }


    public static void main(String[] args) {
       //freq();
      // deepcopy();
       // move();
        //appear();
        remodup();
    }

}



