import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = sc.nextInt();
        String cabeza = "@";
        System.out.printf(" %12s\n",cabeza);
        int cuerpo = 13;
        while (longitud > 1) {
            cuerpo += (int)(Math.random() * 3) - 1;
            for (int i = 1; i < cuerpo; i++) {
                System.out.print(" ");
            }
            
            System.out.println("#");
            longitud--;
        }
        sc.close();
    } 
}
