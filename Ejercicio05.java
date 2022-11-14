import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i <= 50;i++){
            System.out.print((int)(Math.random()*100+100)+" ");
        }
        sc.close();
    }
}
