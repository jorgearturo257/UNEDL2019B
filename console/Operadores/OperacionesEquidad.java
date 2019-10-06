package JavaProgrammingMaster;

public class OperacionesEquidad {

    public boolean NoEsIgual (int a, int b){
       boolean resultado = a != b;
       if (a!=b){
           System.out.println("[a] no es igual a [b]");
       } else {
           System.out.println("[a] y [b] son iguales");
       }
       return resultado;
    }

}
