package TPV_ExamenP1;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat decimas = new DecimalFormat("#.##");
        Habitacion hab1 = new Habitacion(12, 10);
        Tapiz tapiz = new Tapiz(8);
        Calculadora calc = new Calculadora(hab1, tapiz);
        System.out.println(decimas.format(calc));
    }
}

