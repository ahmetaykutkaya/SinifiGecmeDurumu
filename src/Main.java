import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner data =new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int gecme_not = 55 , ort;
        System.out.print("Matematik notunuz : ");
        mat = data.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = data.nextInt();
        System.out.print("Turkce notunuz : ");
        turkce = data.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = data.nextInt();
        System.out.print("Muzik notunuz : ");
        muzik = data.nextInt();

        ort = (mat+fizik+turkce+kimya+muzik)/5;


        if (gecme_not <= ort){
            System.out.println("Ortalamaniz : "+ort);
            System.out.print("SINIFI GECTINIZ...");
        }else {
            System.out.println("Ortalamaniz : "+ort);
            System.out.print("SINIFTA KALDINIZ...");
        }


    }
}