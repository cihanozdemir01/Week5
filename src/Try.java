public class Try {
    public static void main(String[] args) {

        System.out.println("Program başladı");
        /*int  a = 0;
        try {
            a=2/0;
            System.out.println("Try içerisi");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        */

        int[] arr = new int[3];
        try{
            arr[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }


        System.out.println("Program bitti");

    }
}
