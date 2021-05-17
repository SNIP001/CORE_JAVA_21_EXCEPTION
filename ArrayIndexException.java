package $22_Exception_Handling;

public class ArrayIndexException {
    public static void main(String[] args) {
        int [] a = {10,20,30};
        System.out.println("elements of the array are:");
        for (int i = 0; i <=a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("code after array a");
       
    }
     void m1(){
        System.out.println("m1");
    }
}
