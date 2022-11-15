public class Ejercicio16 {
    public static void main(String[] args){
        int figuras;
        int corazon = 0;
        int diamante = 0;
        int herradura = 0;
        int limon = 0;
        int campana = 0;

        String figura = "";
        for(int i = 1;i<=3;i++){
            figuras = (int)(Math.random()*5+1);
            switch(figuras){
                case 1: 
                    figura = "diamante";
                    diamante += 1;
                    break;
                case 2: 
                    figura = "limón";
                    limon += 1;
                    break;
                case 3: 
                    figura = "campana";
                    campana += 1;
                    break;
                case 4: 
                    figura = "herradura";
                    herradura += 1;
                    break;
                case 5: 
                    figura = "corazón";
                    corazon += 1;
                    break;
                
            }
            System.out.print(figura+" ");

        }
            System.out.println();
        
        if(corazon == 2 || campana == 2 || herradura == 2 || limon == 2 || diamante == 2){
            System.out.println("Ha consegido una moneda.");
        }else if(corazon == 3 || campana == 3 || herradura == 3 || limon == 3 || diamante == 3){
            System.out.println("Ha consegido 10 monedas, enhorabuena.");
        }else{
            System.out.println("Ha perdido.");
        }
    }
}
