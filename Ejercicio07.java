public class Ejercicio07 {
    public static void main(String[] args) {
        int resultado;
        int columnas = 3;
        for (int j = 1; j <= 15; j++) {
            System.out.printf("%4d. |", j);
            if (j == 15) {
                columnas = 1;
            }
            for (int i = 1; i <= columnas; i++) {
                resultado = (int)(Math.random() * 3) + 1;
                switch(resultado) {
                    case 1:
                    
                        System.out.print("1  |");
                        break;
                    case 2:
                        System.out.print( "  2|");
                        break;
                    case 3:
                        System.out.print(" X |");
                    default:
                }
            }
            System.out.println();
        }
    }
    
}
