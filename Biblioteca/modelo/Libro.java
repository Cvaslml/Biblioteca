package modelo;

import java.util.ArrayList;

public class Libro 
{
    //----------------------
    // Atributos
    //----------------------
    private String nombre;
    private ArrayList autores;
    private String año;

    //----------------------
    // Metodos
    //----------------------

    public Libro(String pNombre, String pAño)
    {
        this.nombre = pNombre;
        this.año = pAño;
        this.autores = new ArrayList();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void añadirAutor(Autor A)
    {
        autores.add(A);
    }

    public ArrayList getAutor()
    {
        return this.autores;
    }

    public String getAño()
    {
        return año;
    }
}
