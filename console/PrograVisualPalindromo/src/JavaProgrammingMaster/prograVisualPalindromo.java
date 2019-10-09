package JavaProgrammingMaster;

import java.util.Scanner;

public class prograVisualPalindromo {

    public static void main(String[] args) {
        prograVisualPalindromo palindromo= new prograVisualPalindromo();
        palindromo.Palindromo();
    }

    public void Palindromo(){
        Scanner dt = new Scanner(System.in);
        int izq = 0;
        boolean error = false;
        String palabra = "";
        System.out.println("Ingrese una frase y se determinara si es un palindromo: ");
        palabra=dt.nextLine();
        int der = palabra.length()-1;
        while(izq<der && !error){
            if (palabra.charAt(izq)  == palabra.charAt(der)){
                izq++;
                der--;
            } else{
                error = true;
            }

        }
        if(!error){
            System.out.println("Es un palindromo");
        } else{
            System.out.println("No es un palindromo");
        }
    }

}
