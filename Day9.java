import java.util.*;


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day9 {

    static void printlist(Node n1) {
        while (n1 != null) {
            System.out.println(n1.val);
            n1 = n1.next;
        }
    }

    static void listlength(Node n1) {
        int counter = 0;
        while (n1 != null) {
            counter++;
            n1 = n1.next;
        }
        System.out.println(counter);
    }

    static Boolean valsearch(Node n1, int val) {
        Boolean factcheck = true;
        while (n1 != null) {
            if (n1.val == val) {
                return true;
            }
            else {
                factcheck = false;
            }
            n1 = n1.next;
        } return factcheck;
    }

    static Node revnode(Node n1){
        Node prev = null; Node temp =null;
        while(n1 != null){
            temp = n1.next;
            n1.next = prev;
            prev = n1;
            n1 = temp;
        }return prev;
    }

     static Node midfinder(Node n1){
        Node slow =n1; Node fast =n1;
        while(fast != null && fast.next != null){
            slow =slow.next;
            fast =fast.next.next;
        }return slow;
     }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(9);
        n1.next = n2;
        n2.next = n3;
        printlist(n1);
        listlength(n1);
        System.out.println(valsearch(n1, 5));
        Node reversed = revnode(n1);
        printlist(reversed);
        Node midfin = midfinder(n1);
        System.out.println(midfin.val);
    }
}