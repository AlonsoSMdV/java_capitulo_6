import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4):");
        int alto = sc.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4):");
        int ancho = sc.nextInt();
        int posicion = 0; 
        int pez = (int)(Math.random()*(alto - 2)*(ancho - 2));
        for (int i = 0; i < ancho; i++) {
            System.out.print("* " );
        }
            System.out.println();
        for(int i = 2; i < alto; i++) {
                System.out.print("* ");
        for (int j = 2; j < ancho ; j++) {
            if(posicion == pez){
                System.out.print("& ");
            }else{ 
                System.out.print("  ");
            }
            posicion++; 
        }
            System.out.println("* ");
        }
        for (int i = 0; i < ancho; i++) {
            System.out.print("* ");
        }
        sc.close();
    }
}
