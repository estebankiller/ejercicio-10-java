import java.util.Scanner;
public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime los segundos: ");
        int tiempo = sc.nextInt();
        int minutos = 0;
        int horas = 0;
        if (tiempo > 60) {
            minutos = tiempo / 60;
            tiempo %= 60;
        }
        if (minutos > 60) {
            horas = minutos / 60;
            minutos %= 60;
        }
        System.out.print(horas + " horas, " + minutos + " minutos, " + tiempo + " segundos");
    }
}
