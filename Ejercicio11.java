public class Ejercicio11 {
    public static void main(String[] args){
        int azar;
        int suepenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;

        for(int i= 0; i <20; i++){  
            azar = (int)(Math.random()*5+1);
            switch(azar){
                case 1:
                System.out.println("Suspenso ");
                suepenso++;
                break;
                case 2:
                System.out.println("Suficiente ");
                suficiente++;
                break;
                case 3:
                System.out.println("Bien ");
                bien++;
                break;
                case 4:
                System.out.println("Notable ");
                notable++;
                break;
                case 5:
                System.out.println("Sobresaliente ");
                sobresaliente++;
                break;

            }
        }
        System.out.println();
        System.out.print("Hay "+suepenso+" suspensos, "+suficiente+" suficientes, "+bien+" bien, "+notable+" notables, "+sobresaliente+" sobresalientes.");
    }
}
