package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class DialogoAñadirAutor extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreAutor;
    private JTextField tfNombreAutor;
    private JButton btAñadirAutor;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAñadirAutor()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreAutor = new JLabel("Nombre del Autor: ");
        lbNombreAutor.setBounds(30,15,140,20);
        this.add(lbNombreAutor);

        tfNombreAutor = new JTextField();
        tfNombreAutor.setBounds(150,50,100, 25);
        this.add(tfNombreAutor);

        btAñadirAutor = new JButton("Añadir");
        btAñadirAutor.setBounds(20,140,260,25);
        btAñadirAutor.setActionCommand("añadir");
        this.add(btAñadirAutor);

        //Caracteristicas de la ventana
        this.setTitle("Añadir Autor");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreAutor()
    {
        return tfNombreAutor.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAñadirAutor.addActionListener(pAL);
    }

    public void cerrarDialogoAñadirAutor()
    {
        this.dispose();
    }
}
