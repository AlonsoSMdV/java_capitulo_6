import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int azar = (int)(Math.random()*100);
            System.out.println("Intenta adivinar en que número estoy pensando");
        int n;
        int intentos = 5;
        do{
            System.out.print("Introduzca un nº :  ");
            n = sc.nextInt();
            if(n<azar){
                System.out.println("Este nº es menor que el nº secreto");
                intentos--;
                System.out.println("Le quedan "+intentos+" intentos");
            }
            if(n>azar){
                System.out.println("Este nº es mayor que el nº secreto");
                intentos--;
                System.out.println("Le quedan "+intentos+" intentos");
            }
            if(intentos==0){
                System.out.print("Te has quedado sin intentos el nº era: "+azar);
            }
            if(n==azar){
                System.out.print("Has acertado el número");
                intentos = 0;
            }
        }while(intentos>0);
        sc.close();
    }
}