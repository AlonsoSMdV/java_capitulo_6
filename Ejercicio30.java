import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pecera(4 uds como mínimo): ");
        int alto = sc.nextInt();
        System.out.print("Introduzca la anchura de la pecera(4 uds como mínimo): ");
        int ancho = sc.nextInt();
        int posicion = 0;
        int pez;
        int caballito ;
        int caracola;
        if(ancho>=4 && alto>=4){
            do{
                pez = (int)(Math.random()*(alto - 2)*(ancho - 2));
                caballito = (int)(Math.random()*(alto - 2)*(ancho - 2));
                caracola = (int)(Math.random()*(alto - 2)*(ancho - 2));
            }while(pez==caballito||pez==caracola||caballito== caracola);
            for(int i = 0; i < ancho; i++ ){
                System.out.print("* ");
            }
            System.out.println();
            for(int i = 2; i < alto;i++){
                System.out.print("* ");
                for(int j = 2; j < ancho; j++){
                    if(posicion == pez){
                        System.out.print("& ");
                    }else if(posicion == caballito){
                        System.out.print("$ ");
                    }else if(posicion == caracola){
                        System.out.print("@ ");
                    }else{
                        System.out.print("  ");
                    }
                    posicion++;
                }
                System.out.println("* ");
            }
            for(int i = 0; i < ancho; i++ ){
                System.out.print("* ");
            }
        }else{
            System.out.print("Los valores no se han introducido correctamente");
        }   
        sc.close();

    }
}
