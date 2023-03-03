import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int alt,ust,sonuc=1,i;
        Scanner oku=new Scanner(System.in);

        System.out.println("alt giriniz :");
        alt=oku.nextInt();

        System.out.println("ust giriniz :");
        ust=oku.nextInt();

        for (i=1;i<=ust;i++){
            sonuc*=alt;
        }

        System.out.println("sonuc = "+sonuc);


    }
}