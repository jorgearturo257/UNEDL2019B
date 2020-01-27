package MetodosNumericos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] a  = {6,4,1};
        int sawp = 0;

        for (int i = 0; i<2; i++){
            for (int j=0; j<2 -1; j++){
                if(a[j]>a[j+1]){
                    Arrays.sort(a);
                }
            }
        }
        System.out.println("El arreglo ordenado es: "+Arrays.toString(a));
    }


}
