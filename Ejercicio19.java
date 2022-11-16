public class Ejercicio19 {
    public static void main(String[] args){
        int maxPar=-100;
        int minImp = 200;
        int suma = 0;
        for(int i = 0 ; i < 50;i++ ){
            int num = (int)(Math.random()*301)-100;
            System.out.print(num+" ");
            if(num%2 == 0){
                if(num>maxPar){
                    maxPar = num;
                }
            }else{
                if(num<minImp){
                    minImp = num;
                }
            }
            suma += num;
        }
        System.out.print("\nEl nº máximo de los pares: "+maxPar);
        System.out.print("\nEl nº mínimo de los impares: "+minImp);
        System.out.print("\nMedia "+suma/50);

    }
}
