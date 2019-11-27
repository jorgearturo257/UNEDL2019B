using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TPV2doParcial
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            Stack<String> palabra = new Stack<string>();
            palabra.Push(txtPalabra.Text);
            if (palabra.Contains(txtPalabra.Text) == palabra.Contains(txtPalabra.Text))
            {
                
               
                MessageBox.Show("la cantidad de palabras repetidas son: {0}", palabra.Peek());
            }
        }

        private void determinar (Stack<String> texto)
        {

            //texto.Peek(txtPalabra);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
