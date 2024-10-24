import java.util.Random;
import java.util.Scanner;
public class EJ4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r= new Random();
        int contadorjugador=0;
        int contadorbot=0;
        do {
            System.out.println("escoge tu arma:\n0-piedra\n1-papel\n2-tijeras");
            int jugador = sc.nextInt();
            int bot = r.nextInt(3);
            System.out.println("el bot a sacado " + bot);
            if (jugador == 0 && bot == 2) {
                System.out.println("piedra gana a tijera");
                contadorjugador=contadorjugador+1;
            } else if (jugador == 0 && bot == 1) {
                System.out.println("papel gana a piedra");
                contadorbot=contadorbot+1;
            } else if (jugador == 0 && bot == 0) {
                System.out.println("empate");
            } else if (jugador == 1 && bot == 2) {
                System.out.println("tijeras gana a papel");
                contadorbot=contadorbot+1;
            } else if (jugador == 1 && bot == 1) {
                System.out.println("empate");
            } else if (jugador == 1 && bot == 0) {
                System.out.println("papel gana a piedra");
                contadorjugador=contadorjugador+1;
            } else if (jugador == 2 && bot == 2) {
                System.out.println("empate");
            } else if (jugador == 2 && bot == 1) {
                System.out.println("tijeras gana a papel");
                contadorjugador=contadorjugador+1;
            } else if (jugador == 2 && bot == 0) {
                System.out.println("piedra gana a tijeras");
                contadorbot=contadorbot+1;
            }
            else{
                System.out.println("ese numero no vale");
            }
            System.out.println("el bot lleva " +contadorbot);
            System.out.println("el jugador lleva " +contadorjugador);
        }while (contadorjugador<3 && contadorbot<3);
        if (contadorbot==3){
            System.out.println("ohh lo siento ha ganado el bot "+contadorbot+ " a "+contadorjugador);
        } else if (contadorjugador==3){
            System.out.println("enhorabuena has ganado al bot "+contadorjugador+ " a "+contadorbot);
         }

    }
}
