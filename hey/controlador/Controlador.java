package controlador;

import modelo.Libro;
import modelo.Biblioteca;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Biblioteca biblioteca;

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Biblioteca pBiblioteca)
    {
        this.venPrin = pVenPrin;
        this.biblioteca = pBiblioteca;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nBiblioteca\nControlador");
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar LIbro
        if(comando.equals("agregarLibro"))
        {
            venPrin.crearDialogoAgregarLibro();
            this.venPrin.miDialogoAgregarLibro.agregarOyenteBoton(this);
        }

        //Agregar Libro
        if(comando.equals("agregar"))
        {
            String nombre = venPrin.miDialogoAgregarLibro.getNombreLibro();
            String año = venPrin.miDialogoAgregarLibro.getAñoLibro();
            
            biblioteca.agregarLibro(new Libro(nombre, año, autores));
            venPrin.miPanelEntradaDatos.setLibros(nombre);
            venPrin.miPanelResultados.mostrarResultado("Se ha agregado un nuevo libro. \nNombre: " + nombre + "\nAño de edición: " + año);
            venPrin.miDialogoAgregarLibro.cerrarDialogoAgregarLibro();
        }

        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
