package JavaProgrammingMaster;

public class OperacionesRelacionales {

    public boolean menor(int a, int b){
        boolean resultado = a<b ;
        if (a<b) {
            System.out.println("(a) es menor");
        } else {
            System.out.println("(b) es menor");
        }
        return resultado;
    }

    public boolean  mayor(int a, int b){
        boolean resultado = a>b;
        if (a>b){
            System.out.println("(a) es mayor");
        } else {
            System.out.println("(b) es mayor");
        }
        return resultado;
    }

    public boolean menorOigual(int a, int b){
        boolean resultado = a<= b;
        if  (a<=b){
            System.out.println("(a) es menor o iguala a (b)");
        } else {
            System.out.println("(b) es menor o igual a (a)");
        }
        return resultado;
    }

    public boolean mayorOigual(int a, int b){
        boolean resultado = a>= b;
        if  (a>=b){
            System.out.println("(a) es mayor o iguala a (b)");
        } else {
            System.out.println("(b) es mayor o igual a (a)");
        }
        return resultado;
    }

}
