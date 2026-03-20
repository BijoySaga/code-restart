import java.util.*;

public class Day8 {

    static void combino(int[] arr, int target){
        int left =0; int right = arr.length -1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println(arr[left]+" "+arr[right]);
                left++;
                right--;
            }else if(arr[left]+arr[right]>target){
                right--;
            }else{
                left++;
            }
        }
    }

    static List<Integer> difinarr(int[] arr) {
        int left =0; List<Integer> list = new ArrayList<>();list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[left]!=arr[i]){
                list.add(arr[i]);
                left = i ;
            }
        }return list;
    }

    static void totalsum(int[] arr,int k){
        int windsum = arr[0]+arr[1]+arr[2];
        int maxtotal = windsum;
        for(int i =3;i<arr.length;i++){
            windsum = windsum + arr[i]-arr[i-k];
            if(windsum > maxtotal) maxtotal = windsum;
        }System.out.println(maxtotal);
    }

    static void minnum(int[] arr, int tar){
        int left = 0; int windsum =0; int minlength = Integer.MAX_VALUE;
        for(int right =0; right<arr.length;right++){
            windsum = windsum + arr[right];
            while(windsum>tar){
                minlength = Math.min(minlength, right-left+1);
                windsum = windsum - arr[left];
                left++;
            }
        }System.out.println(minlength);
    }

    static void longsubstring(String arr) {
        int left = 0;int maxlen =0;
        Set <Character> set = new HashSet<>();
        for (int right = 0; right < arr.length(); right++) {
            while(set.contains(arr.charAt(right))){
                set.remove(arr.charAt(left));
                left++;
            }set.add(arr.charAt(right));
            maxlen = Math.max(maxlen,right -left+1);
        }
        System.out.println(maxlen);
    }

    public static void main(String[] args) {
        combino(new int[]{1,3,9,12,18,19},28);
        System.out.println(difinarr(new int[]{2, 2, 4, 4, 4,5,5,5}));
        totalsum(new int[]{2,3,4,5,6,8,9},3);
        minnum(new int[]{4,11,14,17,100},125);
        longsubstring("abcabcbb");
    }
}


















