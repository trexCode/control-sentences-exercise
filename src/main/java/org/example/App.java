package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ControlSentences controlSentences = new ControlSentences();
        //controlSentences.checkNumber(0);
//        controlSentences.bucleWhile();
//        controlSentences.doWhile();
//        controlSentences.bucleFor();
        controlSentences.sentenceSwitch();
    }
}

class ControlSentences {

    void checkNumber(int number) {
        if(number < 0) {
            System.out.println("Numero negativo");
        } else if (number > 0) {
            System.out.println("Numero positovo");
        } else {
            System.out.println("El numero es 0");
        }
    }

    void bucleWhile() {
        int numeroWhite = 0;
        while (numeroWhite < 3) {
            System.out.println(numeroWhite);
            numeroWhite++;
        }
    }

    void doWhile() {
        int numeroWhite = 2;
        do {
            System.out.println(numeroWhite);
            numeroWhite++;
        } while(numeroWhite < 3);
    }

    void bucleFor() {
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    void sentenceSwitch() {
        String estacion = "OTOÑO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("La estación del año es primavera");
                break;
            case "VERANO":
                System.out.println("La estación del año es verano");
                break;
            case "OTOÑO":
                System.out.println("La estación del año es otoño");
                break;
            case "INVIERNO":
                System.out.println("La estación del año es invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}
