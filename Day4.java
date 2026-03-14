import java.util.*;

//1. twosum
public class Day4 {
    static void twosum(int total, int miss,int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            miss = total - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == miss) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

// 2.uniqueChars -> Uniqune character or not for an Word check
    static void uniqueChars(String arr){
        boolean flag = true;
        Set <Character> set = new HashSet<>();
        for(int i=0;i<arr.length();i++){
            if(!set.add(arr.charAt(i))) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("unique");
        }else{
            System.out.println("Not unique");
        }
    }

// 3.longestWord -> Longest word in a sentence
    static void longestWord(String word){
        String[] arr = word.split("\\s+");
        int maxlen = arr[0].length();
        String longest = arr[0];
        for(String books: arr) {
            if(maxlen<books.length()){
                maxlen = books.length();
                longest = books;
            }
        }System.out.println(longest);
    }

//4.moveZerosToEnd -> 0 numbers to move to end
    static void moveZerosToEnd(int[] arr) {
        int x=0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y] != 0) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

//5. firstNonRepeating- first non repeating character form the word
    static void firstNonRepeating(String arrr ){
        Map <Character,Integer> mapp = new HashMap<> ();
        for(int l=0;l<arrr.length();l++){
            if(mapp.containsKey(arrr.charAt(l))){
                mapp.put(arrr.charAt(l), mapp.get(arrr.charAt(l))+ 1);
            }else{
                mapp.put(arrr.charAt(l),1);
            }
        }
        for(int p=0;p<arrr.length();p++){
            if(1 == mapp.get(arrr.charAt(p))){
                System.out.println();
                System.out.println(arrr.charAt(p));
                break;
            }
        }
    }


    public static void main(String[] args) {
        twosum(7, 0,new int[] {2,1,4,9,5});
        uniqueChars("helo");
        longestWord("bob jogging and breaking");
        moveZerosToEnd(new int[]{3, 54, 2, 0, 0, 0, 4, 3, 5, 0});
        firstNonRepeating("aabbaadvdccaaddaabbrrabb");

    }
}