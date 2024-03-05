import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inbput = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int num = inbput.nextInt();

        asalSayi(num);


    }

    public static int asalSayi(int sayi){

        if (sayi %2!=0){
            System.out.println(sayi+" bir asal saydır");
        }else{
            System.out.println(sayi+" bir asal sayı değildir");
        }
        return sayi;
    }

}