import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipo;
        do {
            System.out.println("dime el tipo, A O B");
        tipo= sc.next();
        }while (!tipo.equalsIgnoreCase("A")&& (!tipo.equalsIgnoreCase("B")));
        System.out.println("dime el tamaño, 1 O 2");
        int tamaño= sc.nextInt();
        System.out.println("cuantos kilos de uva");
        double kilos = sc.nextInt();
        System.out.println("cuanto vale el kilo de uva");
        double precio= sc.nextDouble();
        double sumaprecio=0;
        if (tipo.equalsIgnoreCase("A")&& tamaño==1){
            sumaprecio=(precio+0.20)*kilos;
        }else if (tipo.equalsIgnoreCase("A")&& tamaño==2 ){
                sumaprecio=(precio+0.30)*kilos;
        } else if (tipo.equalsIgnoreCase("B")&& tamaño==1) {
            sumaprecio=(precio-0.3)*kilos;
        }else if (tipo.equalsIgnoreCase("B")&& tamaño==2){
            sumaprecio=(precio-0.5)*kilos;
        }else{System.out.println("el beneficio final es " + precio*kilos);
        }
        System.out.println("el beneficio final es " + sumaprecio);
    }
}
