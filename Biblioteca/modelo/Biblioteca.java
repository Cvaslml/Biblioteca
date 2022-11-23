package modelo;

import java.util.ArrayList;

public class Biblioteca
{
    //----------------------
    // Atributos
    //----------------------
    private ArrayList colecciones;

    //----------------------
    // Metodos
    //----------------------
    public Biblioteca()
    {
        colecciones = new ArrayList();
    }

    public void agregarColeccion(Coleccion col)
    {
        colecciones.add(col);
    }

    public Coleccion getColeccion(int i)
    {
        return (Coleccion) colecciones.get(i);
    }

    public int getNumeroColecciones()
    {
        return colecciones.size();
    }
}