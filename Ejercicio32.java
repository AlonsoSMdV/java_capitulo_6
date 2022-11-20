import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int LongSend = sc.nextInt();
        int espaciosD = 6;
        for (int i = 0; i < LongSend; i++) {
            for (int j = 0; j < espaciosD; j++) {
                System.out.print(' ');
            }
            System.out.print('|');
            int posObs = -1;
            char obstaculo = '*'; 
            if ((int) (Math.random() * 2) == 0) { 
                posObs = (int) (Math.random() * 4);
                if ((int) (Math.random() * 2) == 0) { 
                    obstaculo = 'O';
                }
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(j == posObs ? obstaculo : ' ');
            }
            System.out.println('|');
            espaciosD += (int) (Math.random() * 3) - 1;
        }
        sc.close();
    }
}