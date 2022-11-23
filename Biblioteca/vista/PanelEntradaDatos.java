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
    private JLabel lbColecciones;
    private static JComboBox cbColecciones;
    
    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta coleccion
        lbColecciones = new JLabel("Colecciones: ", JLabel.RIGHT);
        lbColecciones.setBounds(0,90,100,20);
        this.add(lbColecciones);

        //Crear y agregar combo lista Colecciones
        cbColecciones = new JComboBox();
        cbColecciones.setBounds(100,90,260,20);
        this.add(cbColecciones);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public static String getColeccion()
    {
        return (String) cbColecciones.getSelectedItem();
    }

    public int getIndexColeccion()
    {
        return cbColecciones.getSelectedIndex();
    }

    public void setColeccion(String col)
    {
        cbColecciones.addItem(col);
    }

}
