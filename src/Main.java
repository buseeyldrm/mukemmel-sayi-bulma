import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int a= klavye.nextInt();
        int toplam=0;

        for (int i = 1; i <a ; i++) {
            if (a%i==0){
                System.out.println(a+ " sayısının pozitif bölenleri: " +i);
                toplam+=i;
            }

        }

        System.out.println(a+" sayısının pozitif bölen sayılar toplamı:" +toplam);

        if (toplam==a){
            System.err.println(a+" sayısı mükemmel sayıdır");
        }
        else {
            System.err.println(a+ " sayısı mükemmel sayı değildir.");
        }
    }
}