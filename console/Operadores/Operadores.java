package JavaProgrammingMaster;

public class Operadores {

    public boolean logicos_y(int a, int b){
        boolean resultado = a==b&&b==a;
        if (a==b && b==a ){
            System.out.println("[a] y [b] son iguales");
        } else{
            System.out.println("[a] y [b] son diferentes");
        }
        return resultado;
    }

    public boolean logicos_o(int a, int b){
        boolean resultado = a>=b || b<=a;
        if (a>=b || b<=a){
            System.out.println("[a] es mayor o igual a [b] o [b] es menor o igual a [a]");
        } else{
            System.out.println("[b] es mayor o igual a [a] o [a] es menor o igual a [b]");
        }
        return resultado;
    }

    public void condicionales(int a, int b){
        switch (a){
            case 1:
                System.out.println("Cual es el resultado de 2+2? ");
                if (b == 4){
                    System.out.println("correcto!");
                } else {
                    System.out.println("incorrecto!");
                }
        }
    }

    public void iteracionwhile (int a, int b) {
        if (a<=b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else{
            System.out.println("ingrese un limite valido");
        }
    }
        public void iteraciondowhile (int a, int b) {
            do {
                System.out.println(a);
                a++;
            } while (a <= b);
        }
        public void iteracionfor (int a) {
            for (int i = 0; i <= 10; i++) {
                int resultado = i * a;
                System.out.println(a + "x" + i + "=" + resultado);
            }
        }
    }

