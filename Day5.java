import java.util.*;

//1. Factorial using recursion
public class Day5 {
    static int factorial(int total){
        if(total<=1){
            return 1;
        }else{
            return (total * factorial(total-1));
        }
    }

//    2. fibbonaci with recursion
    static int fibbonaci(int sum){
        if(sum == 0){
            return 0;
        }else if(sum ==1){
            return 1;
        }else{
            return(fibbonaci(sum-1)+ fibbonaci(sum-2));
        }
    }

    //3. sum of whole numbers using recursion
    static int sumnum(int sum){
        if(sum==0) return 0;
        return ((sum%10)+sumnum(sum/10));
    }

//    4. palindrome check using recursion
    static boolean palindrome(String arr, int left, int right) {
        if(left>=right) return true;
        if(arr.charAt(left) != arr.charAt(right)) return false;
        return palindrome(arr,left+1, right-1);
    }

    //5. binary search using recursion
    static int binarySearch(int[] arr, int left, int right, int target){
        if(left>right) return -1;
        int mid = (right+left)/2;
        if(arr[mid] == target) return mid;
        else {
            if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid -1;
            }
            return binarySearch(arr, left, right, target);
        }
    }

    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{2,3,4,5,6}, 0, 4, 6));
        System.out.println(palindrome("abdsba",0,"abdsba".length()-1));
        System.out.println(sumnum(120));
        System.out.println(fibbonaci(78));
        System.out.println(factorial(120));
    }
}