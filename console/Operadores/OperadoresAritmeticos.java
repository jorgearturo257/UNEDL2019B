package JavaProgrammingMaster;

public class OperadoresAritmeticos {

        public int suma(int a, int b){
            int resultado = a + b ;
            System.out.println("El resultado de la suma es : " + resultado);
            return resultado;
        }

        public int resta(int a, int b){
            int resultado = a - b;
            System.out.println("El resultado de la resta es : " + resultado);
            return resultado;
        }

        public int multiplicacion(int a, int b){
            int resultado = a * b;
            System.out.println("El resultado de la multiplicacion es : " + resultado);
            return resultado;
        }

        public float division(float a, float b){
            float resultado = a / b;
            System.out.println("El resultado de la division es : " + resultado);
            return resultado;
        }

        public int residuo(int a, int b){
            int resultado = a % b;
            System.out.println("El residuo es : " + resultado);
            return resultado;
        }
}
