package JavaProgrammingMaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dt = new Scanner (System.in);
        OperadoresAritmeticos aritmeticos = new OperadoresAritmeticos();
        OperacionesRelacionales relacionales = new OperacionesRelacionales();
        OperacionesEquidad equidad = new OperacionesEquidad();
        Operadores opradores = new Operadores();
        int opcion = 0;
        System.out.println("Elija la opcion deseada: ");
        do{
            System.out.println("[1] Operaciones Aritmeticas");
            System.out.println("[2] Operaciones Relacionales");
            System.out.println("[3] Operaciones de Equidad");
            System.out.println("[4] Operaciones Logicas");
            System.out.println("[5] Operaciones Condicionales");
            System.out.println("[6] Operaciones de Iteracion");
            System.out.println("[0] Salir");
            System.out.print("Teclee la opcion deseada: ");
            opcion=dt.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("!Ha elegido Operaciones Aritmetícas");
                    System.out.println("Ingrese el valor de (a): ");
                    int a = dt.nextInt();
                    System.out.println("Ingrese el valor de (b): ");
                    int b= dt.nextInt();
                    int suma = aritmeticos.suma(a,b);
                    int resta = aritmeticos.resta(a,b);
                    int multiplicacion = aritmeticos.multiplicacion(a,b);
                    float divison = aritmeticos.division(a,b);
                    int residuo = aritmeticos.residuo(a,b);
                    break;
                case 2:
                    System.out.println("!Ha elegido Operaciones Relacionales");
                    System.out.println("Ingrese el valor de [a]: ");
                    int a1 = dt.nextInt();
                    System.out.println("Ingrese el valor de [b]: ");
                    int b1 = dt.nextInt();
                    boolean menor = relacionales.menor(a1, b1);
                    boolean mayor = relacionales.mayor(a1, b1);
                    boolean menorIgual = relacionales.menorOigual(a1, b1);
                    boolean mayorIgual = relacionales.mayorOigual(a1, b1);
                    break;
                case 3:
                    System.out.println("!Ha elegido operaciones de equidad");
                    System.out.println("Ingrese el valor de {a}: ");
                    int a2 = dt.nextInt();
                    System.out.println("Ingrese el valor de {b}: ");
                    int b2 = dt.nextInt();
                    boolean noEsIgual = equidad.NoEsIgual(a2, b2);
                    break;
                case 4:
                    System.out.println("!Ha elegido operaciones logicas");
                    System.out.println("Ingrese el valor de [a]: ");
                    int a3 = dt.nextInt();
                    System.out.println("Ingrese el valor de [b]: ");
                    int b3 = dt.nextInt();
                    boolean logicosy = opradores.logicos_y(a3, b3);
                    boolean logicoso = opradores.logicos_o(a3, b3);
                case 5:
                    System.out.println("!Ha elegido operadoraciones condicionales");
                    System.out.println("Ingrese  el valor de [a]: ");
                    int a4 = dt.nextInt();
                    System.out.println("Ingrese el valor de [b]: ");
                    int b4 = dt.nextInt();
                    opradores.condicionales(a4, b4);
                    break;
                case 6:
                    System.out.println("!Ha elegido operaciones de iteracion");
                    System.out.println("Ingrese el valor con el que empezara el iterador [a]: ");
                    int a5 = dt.nextInt();
                    System.out.println("Ingrese el limite del iterador  [b]: ");
                    int b5 = dt.nextInt();
                    opradores.iteracionwhile(a5, b5);
                    System.out.println("Digite la cantidad de terminos:");
                    int a6=dt.nextInt();
                    System.out.println("Ingrese el limite del iterador  [b]: ");
                    int b6 = dt.nextInt();
                    opradores.iteraciondowhile(a6, b6);
                    System.out.println("ingrese un numero cuya tabla de multiplicar desea conocer: ");
                    int a7 = dt.nextInt();
                    opradores.iteracionfor(a7);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }while (opcion != 0);
    }
}
