using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

delegate int OperacionesAritmeticas(int n1, int n2, int n3, int n4, int n5);
namespace ActividadDelegates
{
    class Program
        
    {
        static int num = 0;
        static int num1 = 0;
        static int num2 = 0;
        static int num3 = 0;
        static int num4 = 0;
        static int num5 = 0;
        /*- Sumar 5 números enteros
- Sacar el promedio de esos 5 números enteros
- Sacar el mayor de esos 5 números enteros*/

        public static int  sumarNumeros(int num1, int num2, int num3, int num4, int num5)
        {
            num = num1 + num2 + num3 + num4 + num5;
            return num;
        }

        public static int Promedio(int num1, int num2, int num3, int num4, int num5)
        {
            num = (num1 + num2 + num3 + num4 + num5) / 5;
            return num;
        }

        public static int Mayor(int num1, int num2, int num3, int num4, int num5)
        {
            if(num1>num2 && num1>num3 && num1>num4 && num1 > num5)
            {
                Console.WriteLine("El mayor es el numero 1");
                num = num1;
                
            } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
            {
                Console.WriteLine("El mayor es el numero 2");
                num = num2;
                
            } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
            {
                Console.WriteLine("El mayor es el numero 3");
                num = num3;
                
            } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
            {
                Console.WriteLine("El mayor es el numero 4");
                num = num4;
                
            } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)
            {
                Console.WriteLine("El mayor es el numero 4");
                num = num5;
                
            }
            return num;
        }

        public static int getNum()
        {
            return num;
        }


        static void Main(string[] args)
        {
            OperacionesAritmeticas opa1 = new OperacionesAritmeticas(sumarNumeros);
            OperacionesAritmeticas opa2 = new OperacionesAritmeticas(Promedio);
            OperacionesAritmeticas opa3 = new OperacionesAritmeticas(Mayor);

            opa1(1, 1, 1, 1, 1);
            Console.WriteLine("Suma de enteros {0}", getNum());
            opa2(2,2,2,2,2);
            Console.WriteLine("Promedio {0}", getNum());
            opa3(5, 47, 81, 88, 45);
            Console.WriteLine("Cual es mayor? {0}", getNum());
            Console.ReadKey();

        }
    }
}
