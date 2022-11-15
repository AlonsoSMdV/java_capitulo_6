public class Ejercicio10 {
    public static void main(String[] args){
        int digito ;
        int largo ;
        System.out.println(" ");
        for(int j = 1;j<=10;j++){
            digito = (int)(Math.random()*6+1);
            largo = (int)(Math.random()*40+1);
            System.out.println("");
        for(int i = 0;i<largo;i++){
            switch(digito){
                case 1: 
                System.out.print("* ");
                break;
                case 2: 
                System.out.print("- ");
                break;
                case 3: 
                System.out.print("= ");
                break;
                case 4: 
                System.out.print(". ");
                break;
                case 5: 
                System.out.print("| ");
                break;
                case 6: 
                System.out.print("@ ");
                break;
            }
        }
    }
    }
}
