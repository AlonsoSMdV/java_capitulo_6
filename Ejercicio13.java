public class Ejercicio13 {
    public static void main(String[] args){
        int dado1;
        int dado2;
        int tirada = 1;
        do{
            dado1 = (int)((Math.random()*6)+1);
            dado2 = (int)((Math.random()*6)+1);
            if(dado1 != dado2){
                System.out.println("Tiradas: "+tirada);
                System.out.println("Dado 1: "+dado1);
                System.out.println("Dado 2: "+dado2);
                tirada++;
            }
        }while(dado1 != dado2);
        if(dado1 == dado2){
            System.out.println();

            System.out.println("Han coincidido en la tirada "+tirada);
            System.out.print("Dado 1: "+dado1+" = Dado 2: "+dado2);

        }
    }
}
