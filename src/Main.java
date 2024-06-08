
import  java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws AgeCheckException{
        if (age < 18) {
            throw new AgeCheckException("Yaş hata yakalandı");
        }

        System.out.println("Yaşı uygundur.");
    }
    public static void main(String[] args) throws AgeCheckException{
        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        try {
            checkAge(age);
        } catch(AgeCheckException e) {
            System.out.println(e.toString());
        }


        System.out.println("Program bitti");


    }
}