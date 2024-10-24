import java.util.Random;
import java.util.Scanner;
public class EJ8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("cuantos intentos quieres? ");
        int intentos= sc.nextInt();
        int num1= r.nextInt(7);
        int num2=r.nextInt(7);
        for (int i = 1; i <=intentos; i++) {
            System.out.println("intento numero "+i);
            int oportunidades= sc.nextInt();
            if (oportunidades==num1+num2){
                System.out.println("muy buena el numero era "+(num1+num2));
            } else if (oportunidades<num2+num1) {
                System.out.println("tu suma es menor");
            } else if (oportunidades>num2+num1) {
                System.out.println("tu suma es mayor");

            }
        }

    }
}//no a acabado
