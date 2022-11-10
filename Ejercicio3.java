import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int palo = (int)(Math.random()*4+1);
        int carta = (int)(Math.random()*10+1);
        switch(carta){
            case 1:
            System.out.print("Su carta es el as de ");
            break;

            case 2:
            System.out.print("Su carta es el 2 de ");
            break;

            case 3:
            System.out.print("Su carta es el 3 de ");
            break;

            case 4:
            System.out.print("Su carta es el 4 de ");
            break;

            case 5:
            System.out.print("Su carta es el 5 de ");
            break;

            case 6:
            System.out.print("Su carta es el 6 de ");
            break;

            case 7:
            System.out.print("Su carta es el 7 de ");
            break;

            case 8:
            System.out.print("Su carta es la sota de ");
            break;

            case 9:
            System.out.print("Su carta es el caballo de ");
            break;

            case 10:
            System.out.print("Su carta es el rey de ");
            break;
        }
        switch(palo){
            case 1:
            System.out.print("oros");
            break;

            case 2:
            System.out.print("bastos");
            break;

            case 3:
            System.out.print("espadas");
            break;

            case 4:
            System.out.print("copas");
            break;
        }
        sc.close();
    }
}

