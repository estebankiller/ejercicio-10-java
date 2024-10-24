public class EJ5BUENO {
    public static void main(String[] args) {
        double F=0;
        double C=0;
        while (F<=100){
            C = (F-32)*(5*1.0/9);
            System.out.printf("%.2fºF -> %.2fºC\n",F,C);
            F = F+5;
            C=0;
        }
    }
}