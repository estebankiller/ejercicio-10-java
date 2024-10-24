import java.util.Scanner;
public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saldo anterior del cliente: ");
        double saldo = sc.nextInt();
        System.out.println("pago del mes anterior ");
        double pago = sc.nextInt();
        System.out.println("cantidad pendiente de las compras: ");
        double pendiente = sc.nextInt();
        System.out.println("compras realizadas: ");
        double compras = sc.nextInt();
        double pagomin=0;
        double intereses=0;
        double comprastotales = compras+pendiente;
        pagomin=((pendiente+compras)*0.15);
        System.out.println("el pago mínimo que debe realizar es: " + pagomin+ "€");
        intereses=((pendiente+compras)-pagomin);
        System.out.println("el pago que debe realizar para no generar intereses es: " + intereses+"€");
        System.out.println("pago que desea realizar este mes: ");
        double deseo = sc.nextInt();
        if (deseo<=comprastotales){
            deseo=deseo*1.12;
        }else deseo=deseo;
        if (deseo<pagomin){
            comprastotales=(comprastotales*1.12)+200;
        }else comprastotales=comprastotales;
        System.out.println("una vez realizado el pago, su saldo actual es: " +((saldo-deseo)-pago)+"€");
        System.out.println("la cantidad pendiente de pago de sus compras es: " +comprastotales+"€");
    }
}
//esta mal pero casi