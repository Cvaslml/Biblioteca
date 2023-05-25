package ejecutable;

import controlador.Controlador;
import modelo.Biblioteca;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Biblioteca miBiblioteca = new Biblioteca();
        Controlador miControlador = new Controlador(miVentana,miBiblioteca);
    }    
}
