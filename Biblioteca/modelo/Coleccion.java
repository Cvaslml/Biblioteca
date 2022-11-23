package modelo;

import java.util.ArrayList;

public class Coleccion
{
    //----------------------
    // Atributos
    //----------------------
    private String nombre;
    private ArrayList libros;

    //----------------------
    // Metodos
    //----------------------
    public Coleccion(String pNombre)
    {
        this.nombre = pNombre;
        this.libros = new ArrayList();
    }

    public void AgregarLibro(Libro libroAgregado)
    {
        libros.add(libroAgregado);
    }

    public String getNombre()
    {
        return nombre;
    }
}