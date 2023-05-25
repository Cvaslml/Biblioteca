package modelo;

import java.util.ArrayList;

public class Biblioteca
{
    //----------------------
    // Atributos
    //----------------------
    private ArrayList libros;

    //----------------------
    // Metodos
    //----------------------
    public Biblioteca()
    {
        libros = new ArrayList();
    }

    public void agregarLibro(Libro lb)
    {
        libros.add(lb);
    }

    public Libro getLibro(int i)
    {
        return (Libro) libros.get(i);
    }

    public int getNumeroLibros()
    {
        return libros.size();
    }
}