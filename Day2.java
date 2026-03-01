import java.util.*;


public class Day2{
    //1. Second highest number
    static void secondLargest(){
        int[] arr = new int[] {-2,-23,23,43,64,23};
        int hig = arr[0];
        int sechig = hig;
        for(int j =0; j<arr.length ; j++){
            if(arr[j]>hig){
                sechig = hig;
                hig = arr[j];
            }else if(hig > arr[j] && arr[j] > sechig){
                sechig = arr[j];
            }
        } System.out.println(sechig);
    }

//2. check vowel in string
    static void vowelCount(){
        String wors = "alola";
        int counter = 0;
        for(int i =0; i<wors.length() ; i++){
            if(( wors.charAt(i) == 'a') || (wors.charAt(i) == 'e') || (wors.charAt(i) == 'i') || (wors.charAt(i) == 'o') || (wors.charAt(i) == 'u')){
                counter = counter +1;
            }
        }
        System.out.println(counter);
    }


//3. check palindrome or not
    static void palindrome(){
        String esse = "pikachu";
        String checker = "";
        for(int g = esse.length()-1; g>=0;g--){
            checker = checker + esse.charAt(g);
        }if(esse.equals(checker)){
            System.out.println("Its is palindrome");
        }else{
            System.out.println("Its is not palindrome");
        }
    }


//4. fibbonaci 1 to 10
static void fibonacci(){
        int a =0; int b =1; int num =0;
        System.out.println(a);
        System.out.println(b);
        for(int q =0;q<=8;q++){
            num = a+b;
            a =b;
            b = num;
            System.out.println(num);
        }
    }


//5. Factorial of number
static void factorial(){
        int nua = 5;
        int store = 1;
        for(int x =nua ; x>=1 ; x-- ){
            store = (store * x);
        }System.out.println(store);
    }

public static void main(String[] args) {
    secondLargest();
    vowelCount();
    palindrome();
    fibonacci();
    factorial();
}
}

