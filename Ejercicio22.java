public class Ejercicio22 {
    public static void main(String[] args){
        System.out.print("Por favor, introduzca la longitud de la serpiente en ");
        System.out.print("caracteres contando la cabeza: ");
        int longitud = Integer.parseInt(System.console().readLine());
        System.out.println(" @");
        int x = 13;
        while (longitud > 1) {
            // suma -1, 0 o 1 a la variable x
            x += (int)(Math.random() * 3) - 1;
            // pinta x - 1 espacios
            for (int i = 1; i < x; i++) {
                System.out.print(" ");
            }
            // pinta el cuerpo
            System.out.println("#");
            longitud--;
        }
    } 
}
