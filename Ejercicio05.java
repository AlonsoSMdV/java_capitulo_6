import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int minimo = 100;
        int maximo = 199;
        int suma = 0;
        int n;
        for(int i = 1;i <= 50;i++){
            n = (int)(Math.random()*100+100);
            System.out.print(n+" ");
            suma += n;
            if(n<minimo){
                minimo = n;
            }
            if(n>maximo){
                maximo = n;
            }
        }
        System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);
        sc.close();
    }
}
