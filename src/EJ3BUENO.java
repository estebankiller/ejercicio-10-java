import java.util.Scanner;
public class EJ3BUENO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bienvenido a AVARO BANK, Cual es tu saldo anterior: ");
        double saldoAnt = sc.nextDouble();
        System.out.print("Cual es su pago anterior: ");
        double pagoanterior = sc.nextDouble();
        System.out.print("Cual es su cantidad pendiente: ");
        double pendiente = sc.nextDouble();
        System.out.print("Compras realizadas este mes: ");
        double compraactual = sc.nextDouble();
        double saldoAct = saldoAnt-pagoanterior;
        double minimo = (pendiente+compraactual)*0.15;
        double max = (pendiente+compraactual)*0.85;
        System.out.printf("el mínimo que debe pagar es: %.2f€\n",minimo);
        System.out.printf("el pago para no generar intereses es: %.2f€\n",max);
        System.out.print("Pago que quiere realizar este mes: ");
        double pagoactual = sc.nextDouble();
        double deudatotal=pendiente+compraactual;
        if (pagoactual >= max) {
            System.out.printf("queda pendiente: %.2f€\n30", deudatotal-pagoactual);
            System.out.printf("Le queda en su cuenta una vez hecho el pago: %.2f€",saldoAct-pagoactual);
        }
        else if (pagoactual>=minimo){
            System.out.printf("queda pendiente: %.2f€\n", (deudatotal-pagoactual)*1.12);
            System.out.printf("Le queda en su cuenta una vez hecho el pago: %.2f€",saldoAct-pagoactual);
        }
        else {
            System.out.printf("queda pendiente: %.2f€\n", ((deudatotal - pagoactual) * 1.12)+200);
            System.out.printf("Le queda en su cuenta una vez hecho el pago: %.2f€", saldoAct - pagoactual);
        }
    }
}