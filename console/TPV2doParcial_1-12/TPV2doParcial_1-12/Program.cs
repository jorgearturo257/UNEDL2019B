using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPV2doParcial_1_12
{
    class Program
    {
        static void Main(string[] args)
        {
/* 
1. Describa en sus propias palabras el concepto de colecciones (collections) y cuales tipos existen.
2.
Defina a que se refiere el concepto de código no seguro y que se necesita para implementarlo.
3.
Mencione al menos tres clases que se utilizan en lo y proporcione brevemente la idea central de

las mismas.

4. Explique la diferencia entre los siguientes códigos en csharp
a. Console. Writeline ("resultado: (*ptr) ").
b. Console.WriteLine("resultado: ((int)ptr)")
5.
Mencione al menos tres caracteristicas de las excepciones (Exceptions).
6.
En Java, mencione y describa los tres tipos de excepciones.
7. Explique brevemente a que se refiere con directivas para preprocesador y que se necesita para

usarlas.

8. Explique las diferencias entre ArrayList, Sorted List Hash Table.
9. Describa las para que sirven StreamReader y StreamWriter
10. Explique el funcionamiento del algoritmo Quicksort
11. En Java, explique cuál es la diferencia entre System.out, System.in y System.err
12. Explique cuáles son las ventajas de utilizar "generic collections"
13 Desarrolle en C#, un programa en Windows Forms llamado TPV2doParcial que permita crear un
archivo, lo lea y permita escribir en el. El programa debe permitir la captura de una lista de palabras
y al finalizar la captura, debe reportar la cantidad total de palabras, las palabras repetidas y la
cantidad de ocurrencias. Capture las excepciones necesarias. Al terminar, suba su codigo a su
repositorio y escriba el SHA correspondiente en el examen*/
            /* 1.- Las colecciones son una serie de clases que se especializan para utilizar y o manejar una gran cantidad de valores, objetos de diferentes clases
             * Existen 8 tipos: las list, hash, sorted list, stack, queue y bit array
             * 
             * 2.- Se refiere al uso de apuntadores que el recolector de basura no puede recolectar ya que los mismos no apuntan a referencias si no que 
             * apuntan a tipos de datos primitivos o estructuras primitivas o incluso otros apuntadores
             * para implementar el codigo no seguro utilisamos la palabra reservada de modificador de acceso "unsafe" ya sea para metodos, propiedades o constructores
             * se debehabilitar en el compilador el uso de unsafe de lo contrario arrojara un error de compilacion
             * 
             * 3.- la clase InputStream: basicamente se trata de leer los bytes que tiene el programa
             * la clase Reader: Trata de leer los caracteres del programa
             * la clase OutputStream: Esta consiste en escribir bytes al programa
             * 
             * 4.- Esta imprimiendo un puntero 
             * Esta imprimiendo un casteo de puntero a entero 
             * 
             * 5.- 1: en c# las excepciones se representan mediante clases que son derivadas de la clase System:Exception
             * 2: una de las excepciones mas comunes es try y catch que se usan para identificar un bloque de codigo el cual podria arrojar una excepcion lo cual si eso pasa lo captura y manda un mensaje de modo que el programa se puede seguir ejecuntandose
             * 3:throw se usa generalmente para arrojar una excepion cuando se haya algu problema 
             * 
             * 6.- Runtime exception este error es causado por un puntero que apunta a un null 
             * checked exception: Java deberia anticiparse y recuperarse del error java.io.FileNotFoundException
             * Unchecked exception: Error interno de la aplicacion usualmente causado o anticipado por java.io.IOError
             * 
             * 7.- Estas le dan una serie de instrucciones al compilador para que pueda procesar la informacion anesde iniciar la compilacion
             * se requiere iniciarlas con # y estas no terminan con el rutinal ;
             * 
             * 8.- el array list puede ingresar un valor indeterminado de datos mientras que en el hashtable se meten en pares donde uno es una llave y otro es el valor
             * 
             * 9.- StreamReader lee los caracteres de un programa y StreamWriter escribe bytes en el programa
             * 
             * 10.- Consta de que parte de un pivote particionado el cual divide en dos filas los elementos, los mayores van del lado derecho
             * y los menores al lado izquierdo basicamente organiza datos segun su tamaño
             * 
             * 11.- la diferencia es que .out es una salida estandar y .err es un error estandar
             * 
             * 12.- Pueden almacenar cualquier tipo de elemento, se impacta el rendimiento en su uso por el boxiing/unboxing, contiene las colecciones de listas mas comunes como list sortedlist queue, stack
             * 
             * 
             */
        }
    }
}
