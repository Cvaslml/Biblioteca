package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbLibros;
    private static JComboBox cbLibros;
    
    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta coleccion
        lbLibros = new JLabel("Libros: ", JLabel.RIGHT);
        lbLibros.setBounds(0,50,100,20);
        this.add(lbLibros);

        //Crear y agregar combo lista Colecciones
        cbLibros = new JComboBox();
        cbLibros.setBounds(100,50,260,20);
        this.add(cbLibros);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public static String getLibro()
    {
        return (String) cbLibros.getSelectedItem();
    }

    public int getIndexColeccion()
    {
        return cbLibros.getSelectedIndex();
    }

    public void setLibros(String lbs)
    {
        cbLibros.addItem(lbs);
    }

}
