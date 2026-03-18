import java.util.*;

public class Day7 {

    static void wordCount(String arr){
        String[] rar = arr.split("\\s+");
        System.out.println(rar.length);
    }

    static void reversy(String arr) {
        String[] rar = arr.split("\\s+");
        for (String s : rar) {
            for (int k = s.length() - 1; k >= 0; k--) {
                System.out.print(s.charAt(k));
            }System.out.print(" ");
        }System.out.println();
    }

    static void pangramCheck(String arr){
        Set <Character> set = new HashSet<>();
        String sml = arr.toLowerCase();
            for(int i =0;i<sml.length();i++) {
                if (Character.isLetter(sml.charAt(i))) {
                    set.add(sml.charAt(i));
                }
            }
        if(set.size()==26){
            System.out.println("Panagram");
        }else{
            System.out.println("Not Panagram");
        }
    }

    static void cmnpref(String[] arr){
        String result ="";
        for(int j =0;j<arr[0].length();j++){
            char ch = arr[0].charAt(j);
            for(int i=1; i <arr.length ;i++){
                if(arr[i].charAt(j) != ch || j >= arr[i].length()){
                    System.out.println(result);
                    return;
                }
            }
            result += ch;
        }
        System.out.println(result);
    }

    static void compressString(String arr){
        int count = 0;
        char ch = arr.charAt(0);
        String st = "";
        for(int i =0;i<arr.length();i++){
            if(arr.charAt(i)==ch){
                count +=1;
            }else{
                st +=(""+ch+count);
                count = 1;
                ch = arr.charAt(i);
            }
        }st += ("" + ch + count);
        System.out.print(st);
        System.out.println();
    }

    public static void main(String[] args) {
        compressString("aabbcc");
        cmnpref(new String[]{"flower", "flow", "flight"});
        pangramCheck("The quick brown fox jumps over the lazy dog");
        reversy("Hello World");
        wordCount("A name is also can be an surname");
    }
}
