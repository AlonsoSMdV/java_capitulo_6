import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in);
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int estacion = sc.nextInt();
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("--------------------------------");
        int MaxT = 0;
        int MinT = 0;
        String cielo = "";
        switch(estacion){
            case 1:
                MaxT = (int)(Math.random()*16+15);
                MinT = (int)(Math.random()*16+15);
                cielo = Math.random() <= 0.6 ? "Soleado" : "Nublado";
                break;
            case 2:
                MaxT = (int)(Math.random()*21+25);
                MinT = (int)(Math.random()*21+25);
                cielo = Math.random() <= 0.8 ? "Soleado" : "Nublado";
                break;
            case 3:
                MaxT = (int)(Math.random()*11+20);
                MinT = (int)(Math.random()*11+20);
                cielo = Math.random() <= 0.4 ? "Soleado" : "Nublado";
                break;
            case 4:
                MaxT = (int)(Math.random()*26);
                MinT = (int)(Math.random()*26);
                cielo = Math.random() <= 0.2 ? "Soleado" : "Nublado";
                break;
        }
        if(MinT > MaxT){
            int aux = MinT;
            MinT = MaxT;
            MaxT = aux;
        }
        System.out.println("Temperatura mínima: "+MinT);
        System.out.println("Temperatura máxima: "+MaxT);
        System.out.println(cielo);
        sc.close();
    }
}
