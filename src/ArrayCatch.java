import java.util.Scanner;

public class ArrayCatch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        Integer[] list = new Integer[]{0,1,2,3,4,5,6,7,8,9};

        System.out.print("10 elemanlı bir diziden indeks numarasına göre bir " +
                "eleman döndürülecektir. Lütfen bir 1-10 arasında bir numara giriniz : ");
        int i = inp.nextInt()-1;
        try {
            System.out.println("Girdiğiniz sayıya karşılık gelen indeks değeri : " + list[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hatalı Giriş !");
            System.out.println(e.getMessage());
        }
    }
}
