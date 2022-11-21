import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la tableta: ");
        int alto = sc.nextInt();
        System.out.print("Introduzca la anchura de la tableta: ");
        int ancho = sc.nextInt();
        int Mordisco = (int) (Math.random() * (ancho * 2 + (alto - 2) * 2));
        int posicion = 0;
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                boolean esta = (i == 0) || (i == alto - 1) || (j == 0) || (j == ancho - 1);
                if ((posicion == Mordisco) && esta) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                if (esta) {
                    posicion++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
