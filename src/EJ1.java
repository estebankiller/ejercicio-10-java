import java.util.Scanner;
public class EJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime nº A: ");
        int a= sc.nextInt();
        System.out.print("dime nº B: ");
        int b= sc.nextInt();
        System.out.print("dime nº C: ");
        int c= sc.nextInt();
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
            System.out.print("Es rectángulo");
        else if (a==b && a==c)
            System.out.print("Es equilátero");
        else if (a==b || a==c || b==c)
            System.out.print("Es isósceles");
        else
            System.out.print("Es escaleno");
    }
}
