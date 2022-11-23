package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btAgregarColeccion;
    private JButton btAgregarLibro;
    private JButton btSalir;

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton AgregarColeccion
        btAgregarColeccion = new JButton("Agregar Coleccion");
        btAgregarColeccion.setBounds(10,20,170,20);
        btAgregarColeccion.setActionCommand("agregarColeccion");
        this.add(btAgregarColeccion);

        //Crear y agregar boton AgregarLibro
        btAgregarLibro = new JButton("Agregar Libro");
        btAgregarLibro.setBounds(10,50,170,20); 
        btAgregarLibro.setActionCommand("agregarLibro");
        this.add(btAgregarLibro);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarColeccion.addActionListener(pAL);
        btAgregarLibro.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
}
