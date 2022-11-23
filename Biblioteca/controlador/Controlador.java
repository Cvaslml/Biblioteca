package controlador;

import modelo.Libro;
import modelo.Coleccion;
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

        //Abrir ventana Agregar Coleccion
        if(comando.equals("agregarColeccion"))
        {
            venPrin.crearDialogoAgregarColeccion();
            this.venPrin.miDialogoAgregarColeccion.agregarOyenteBoton(this);
        }

        //Agregar Coleccion
        if(comando.equals("agregar"))
        {
            String nombre = venPrin.miDialogoAgregarColeccion.getNombreColeccion();
            biblioteca.agregarColeccion(new Coleccion(nombre));
            venPrin.miPanelEntradaDatos.setColeccion(nombre);
            venPrin.miPanelResultados.mostrarResultado("Se ha agregado una nueva Coleccion. \nNombre: " + nombre);
            venPrin.miDialogoAgregarColeccion.cerrarDialogoAgregarColeccion();
        }

        //Abrir ventana Agregar un libro
        if(comando.equals("agregarLibro"))
        {
            venPrin.crearDialogoAgregarLibro();
            this.venPrin.miDialogoAgregarLibro.agregarOyenteBoton(this);
        }

        //Agregar libro
        if(comando.equals("agregar"))
        {
            int indexObra = venPrin.miPanelEntradaDatos.getIndexColeccion();

            String nombre = String.format(venPrin.miDialogoAgregarLibro.getNombreLibro());
            String año = String.format(venPrin.miDialogoAgregarLibro.getAñoLibro());

            Coleccion bibl = biblioteca.getColeccion(indexObra);
            bibl.AgregarLibro(new Libro(nombre, año));

            venPrin.miPanelResultados.mostrarResultado("A la coleccion: " + bibl.getNombre() + " se le ha agregado un libro\nNombre:" + nombre + "\nAño de edición:" + año);
            venPrin.miDialogoAgregarLibro.cerrarDialogoAgregarLibro();
        }

        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
