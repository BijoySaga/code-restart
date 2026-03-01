import java.util.*;

public class Day1 {
    //1 to 10 even number
    static void printNumbers() {
        for (int m = 1; m <= 10; m++) {
            if (m % 2 == 0) {
                System.out.println(m);
            }
        }
    }

    //2. prime check
    static void primeCheck(){
        boolean isprime = false;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please type your number");
        int cheq = obj.nextInt();
        if(cheq ==1){
            System.out.println("is not prime");
        }
        for(int n =2;n<cheq;n++){
            if(cheq % n == 0){
                isprime = true;
                break;
            }
        }
        if(isprime == false){
            System.out.println(cheq +" is prime");
        }else{
            System.out.println(cheq +" is not prime");
        }
    }

    //3. reverse a String
    static void reverseString(String input){
        String newpink ="";
        for(int o = input.length()-1;o>=0;o--){
            newpink = newpink + input.charAt(o);
        }
        System.out.println(newpink);
    }

    // 4.Largest num in an array
    static void largestNumber(int[] thearr){
        int numcheck = thearr[0];
        for(int p =1; p<thearr.length;p++){
            if(thearr[p]>numcheck){
                numcheck = thearr[p];
            }
        }System.out.println(numcheck);
    }

    //5. FizzBuzz for divisible of 3,5 and 15.
    static void fizzBuzz(){
        for(int i = 1; i<=30;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        printNumbers();
        primeCheck();
        reverseString("pot");
        largestNumber(new int[]{-3,10, 25, 3, 47, 8});
        fizzBuzz();
    }
}
