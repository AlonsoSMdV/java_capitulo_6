import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Se mostrará la tirada de tres dados");
        for(int i = 1; i <= 3; i++){
            int dado = (int)(Math.random()*6+1);
            System.out.println("Tirada "+i+": "+dado);
            sum += dado;
        }
        System.out.println("La suma de las tres tiradas es: "+sum);
        sc.close();
    }
}