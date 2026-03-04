import java.util.*;

public class Day3{
// 1. Find duplicate numbers in an array
    static void findDuplicates(int[] parr){
        Set<Integer> seen = new HashSet<>();
        for(int i =0;i< parr.length;i++){
            if(seen.contains(parr[i])){
                System.out.println(parr[i]);
            }else{
                seen.add(parr[i]);
            }
        }
    }

// 2. Check if two strings are anagrams of each other
    static void anagramcheck(String arr, String arr2){
        char[] arr3 = arr.toCharArray();
        Arrays.sort(arr3);
        String sorted = new String(arr3);
        char[] arr4 = arr2.toCharArray();
        Arrays.sort(arr4);
        String sorted2 = new String(arr4);
        if(sorted.equals(sorted2)){
            System.out.println("this is anagram");
        }else{
            System.out.println("this is not an anagram");
        }
    }

// 3. Find the missing number in an array of 1 to N
    public static void missingNumber(int[] arr){
        int N = 5;
        int whol = 0;
        int  total = N *(N + 1)/2;
        for(int i =0;i<arr.length;i++){
            whol = whol + arr[i];
        }
        int mis =  (total - whol);
        System.out.println(mis);
    }

// 4. Reverse an array in place without a second array
    public static void reverseArray(int[] arr2){
        for(int d=0;d<arr2.length/2;d++){
            int j = arr2.length - 1 - d;
            int temp = arr2[d];
            arr2[d]=arr2[j];
            arr2[j]=temp;
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }

// 5. Count how many times each character appears in a string
    static void charCount(String arr3) {
        Map<Character, Integer> map = new HashMap<>();
        for (int q = 0; q < arr3.length(); q++) {
            if (map.containsKey(arr3.charAt(q))) {
                map.put(arr3.charAt(q), map.get(arr3.charAt(q)) + 1);
            } else {
                map.put(arr3.charAt(q), 1);
            }

        }
        System.out.println(map);
    }



    public static void main(String[] args){
        findDuplicates(new int[] {2,32,43,64,243,64,34,2,25,64,75});
        anagramcheck( "lolo","olol");
        missingNumber(new int[] {1,2,4,5});
        reverseArray(new int[] {2,3,4,1});
        charCount("hello");
    }
}