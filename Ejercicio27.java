import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su jugada: ");
        String jugada1 = sc.next();
        String jugada2 = "";
        int jugadaPc = (int)(Math.random()*3)+1;
        switch(jugadaPc){
            case 1:
                jugada2 = "papel";
                break;
            case 2:
                jugada2 = "piedra";
                break;
            case 3:
                jugada2 = "tijera";
                break;
                
        }
        System.out.println("La jugada del ordenador es: "+jugada2);
        if((jugada1.equals("papel") && jugada2.equals("papel")) || (jugada1.equals("piedra") && jugada2.equals("piedra")) || (jugada1.equals("tijera") && jugada2.equals("tijera"))){
            System.out.println("Empate");
        }else if((jugada1.equals("papel") && jugada2.equals("piedra")) || (jugada1.equals("piedra") && jugada2.equals("tijera")) || (jugada1.equals("tijera") && jugada2.equals("papel"))){
            System.out.println("Jugador 1 gana");
        }else if((jugada1.equals("papel") && jugada2.equals("tijera")) || (jugada1.equals("piedra") && jugada2.equals("papel")) || (jugada1.equals("tijera") && jugada2.equals("piedra"))){
            System.out.println("Ordenador gana");
        }
        sc.close();
    }
}
