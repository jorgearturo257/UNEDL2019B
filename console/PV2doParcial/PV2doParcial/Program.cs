using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace PV2doParcial
{
    class Program
    {
        static void Main(string[] args)
        {
            string cadena = "";
            Stack miPila = new Stack();
            Console.WriteLine("se verificara si las sig cadenas son correcta comparada con {()()} {()}");
            {
                miPila.Push("({){}({()}");
                miPila.Push("{(){((())}");
                miPila.Push("{((()()}})");
                miPila.Push("{()()} {()}");
                 for(int i = 1; i<=4; i++)
                {
                    cadena = (string)miPila.Pop();
                    Console.WriteLine(cadena);

                }

             if(cadena.ToString() == " {()()} {()}")
                {
                    Console.WriteLine("la cadena es correcta {0}", (string)miPila.Pop());
                }
                else
                {
                    Console.WriteLine("La cadena no es correcta");
                }



            }
            Console.ReadKey();
        }
    }
}
