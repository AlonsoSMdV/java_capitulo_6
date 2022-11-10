import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int palo = (int)(Math.random()*4+1);
        int carta = (int)(Math.random()*13+1);
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
            System.out.print("Su carta es el 8 de ");
            break;

            case 9:
            System.out.print("Su carta es el 9 de ");
            break;

            case 10:
            System.out.print("Su carta es el 10 de ");
            break;

            case 11:
            System.out.print("Su carta es la J de ");
            break;

            case 12:
            System.out.print("Su carta es la Q de ");
            break;

            case 13:
            System.out.print("Su carta es la K de ");
            break;
        }
        switch(palo){
            case 1:
            System.out.print("picas");
            break;

            case 2:
            System.out.print("tréboles");
            break;

            case 3:
            System.out.print("diamantes");
            break;

            case 4:
            System.out.print("corazones");
            break;
        }
        sc.close();
    }
}