import java.util.Random;
import java.util.Scanner;
public class EJ6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int dado;
        do {
            System.out.print("Dime cuantas veces se tira el dado: ");
            dado = sc.nextInt();
        }while(dado<=0);
        int numeros;
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        int cnt5 = 0;
        int cnt6 = 0;
            for (int i = 0; i < dado; i++) {
            numeros = r.nextInt(dado) + 1;
            if (numeros == 1)
                cnt1++;
            else if (numeros == 2)
                cnt2++;
            else if (numeros == 3)
                cnt3++;
            else if (numeros == 4)
                cnt4++;
            else if (numeros == 5)
                cnt5++;
            else
                cnt6++;
        }
        System.out.println("Ha salido el 1 "+cnt1+" veces");
        System.out.println("Ha salido el 2 "+cnt2+" veces");
        System.out.println("Ha salido el 3 "+cnt3+" veces");
        System.out.println("Ha salido el 4 "+cnt4+" veces");
        System.out.println("Ha salido el 5 "+cnt5+" veces");
        System.out.println("Ha salido el 6 "+cnt6+" veces");
    }
}