
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // değişkenler
        int mat,fizik,kimya,tr,tarih,music;
        Scanner bob = new Scanner(System.in);
    // değerler
        System.out.print("Matematik:");
        mat = bob.nextInt();

        System.out.print("fizik:");
        fizik = bob.nextInt();

        System.out.print("Kimya:");
        kimya = bob.nextInt();

        System.out.print("Türkçe:");
        tr = bob.nextInt();

        System.out.print("Tarih:");
        tarih = bob.nextInt();

        System.out.print("Müzik:");
        music = bob.nextInt();

        int total = (mat+fizik+kimya+tr+tarih+music);
        double result = total/6.0 ;

        if (result >= 60);
        System.out.println("Ortalamanız:" + result+ "Passed");
         if (result < 60);//if or delete all this and write else
        System.out.println("Ortalamanız:" + result+"Failed");


    } }
