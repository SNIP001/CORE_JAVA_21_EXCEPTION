package $22_Exception_Handling;

import java.util.Scanner;


public class ArithmeticException {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter two integers");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b= obj.nextInt();
        c=a/b;
        System.out.println("result"+c);   //java.lang.ArithmeticException when we use 0/0
    }
}
