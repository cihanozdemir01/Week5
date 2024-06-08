import java.util.Scanner;

public class ArrayCatch {
    public static void main(String[] args) {
        int[] list ={0,1,2,3,4,5,6,7,8,9};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir 1-10 arasında bir numara giriniz : ");
        int index = scanner.nextInt()-1;

        try {
            int number = getNumberAtIndex(list, index);
            System.out.println("Seçilen numara: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Geçersiz indeks numarası. Lütfen 1-10 arasında bir numara giriniz.");
            System.out.println(e.getMessage());
        }
    }

    public static int getNumberAtIndex(int[] list, int index){
        return list[index];
    }
}
