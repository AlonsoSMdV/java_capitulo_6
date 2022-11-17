import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = sc.nextInt();
        int litro = (int)(Math.random()*(capacidad+1));
        for(int i = 0; i <capacidad;i++){
            if ( i < (capacidad-litro)){
                System.out.println("*    *");
            }else{
                System.out.println("*====*");
            }
        }
        System.out.print("******");
        sc.close();
    }
}
