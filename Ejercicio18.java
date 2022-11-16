public class Ejercicio18 {
    public static void main(String[] args){
        String colores = "";
        int color;
        int color1;
        int  color2;
        do{
            color = (int)(Math.random()*6+1);
            color1 = (int)(Math.random()*6+1);
            color2 = (int)(Math.random()*6+1);
            switch(color){
                case 1: 
                    colores = "rojo";
                    break;
                case 2: 
                    colores = "verde";
                    break;
                case 3: 
                    colores = "azul";
                    break;
                case 4: 
                    colores = "amarillo";
                    break;
                case 5: 
                    colores = "violeta";
                    break;
                case 6: 
                    colores = "naranja";
                    break;
                
            }
            switch(color2){
                case 1: 
                    colores = "rojo";
                    break;
                case 2: 
                    colores = "verde";
                    break;
                case 3: 
                    colores = "azul";
                    break;
                case 4: 
                    colores = "amarillo";
                    break;
                case 5: 
                    colores = "violeta";
                    break;
                case 6: 
                    colores = "naranja";
                    break;
                
            }
            switch(color2){
                case 1: 
                    colores = "rojo";
                    break;
                case 2: 
                    colores = "verde";
                    break;
                case 3: 
                    colores = "azul";
                    break;
                case 4: 
                    colores = "amarillo";
                    break;
                case 5: 
                    colores = "violeta";
                    break;
                case 6: 
                    colores = "naranja";
                    break;
                
            }
            System.out.print(colores+" ");
        }while((color == color1) || color == color2 || color1 == color2 );
    }
}
