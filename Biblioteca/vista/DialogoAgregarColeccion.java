package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoAgregarColeccion extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreColeccion;
    private JTextField tfNombreColeccion;
    private JButton btAgregarColeccion;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarColeccion()
    {

        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreColeccion = new JLabel("Nombre de la Coleccion: ");
        lbNombreColeccion.setBounds(30,15,140,20);
        this.add(lbNombreColeccion);

        tfNombreColeccion = new JTextField();
        tfNombreColeccion.setBounds(150,50,100, 25);
        this.add(tfNombreColeccion);

        btAgregarColeccion = new JButton("Agregar");
        btAgregarColeccion.setBounds(20,140,260,25);
        btAgregarColeccion.setActionCommand("agregar");
        this.add(btAgregarColeccion);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Coleccion");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreColeccion()
    {
        return tfNombreColeccion.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarColeccion.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarColeccion()
    {
        this.dispose();
    }

}
