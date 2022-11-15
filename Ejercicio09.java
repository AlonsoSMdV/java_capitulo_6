public class Ejercicio09 {
    public static void main(String[] args){
        int azar;
        int cont = 0;
        do{
            azar = (int)(Math.random()*101);
            if( azar % 2 == 0){
                System.out.print(azar+" ");
                cont++;
            }
        }while(azar != 24);
        System.out.println();
        System.out.print("Se han generado "+cont+" números");
    }
}
