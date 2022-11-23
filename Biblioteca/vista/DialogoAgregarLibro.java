package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Font;

public class DialogoAgregarLibro extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreLibro;
    private JTextField tfNombreLibro;
    private JButton btAgregarLibro;
    private JButton btAñadirAutor;
    private JLabel lbAutoresLibro;
    private static JComboBox cbAutores;
    private JLabel lbAñoLibro;
    private JTextField tfAñoLibro;
    private JLabel lbNombreColeccion;
    public DialogoAñadirAutor miDialogoAñadirAutor = null;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarLibro()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreLibro = new JLabel("Nombre del Libro: ");
        lbNombreLibro.setBounds(10,50,140,20);
        this.add(lbNombreLibro);

        tfNombreLibro = new JTextField();
        tfNombreLibro.setBounds(150,50,100, 25);
        this.add(tfNombreLibro);

        lbAñoLibro = new JLabel("Año de edición: ");
        lbAñoLibro.setBounds(10,100,140,20);
        this.add(lbAñoLibro);

        tfAñoLibro = new JTextField();
        tfAñoLibro.setBounds(150,100,100, 25);
        this.add(tfAñoLibro);

        lbAutoresLibro = new JLabel("Autores: ");
        lbAutoresLibro.setBounds(10,150,140,20);
        this.add(lbAutoresLibro);

        //Crear y agregar combo lista Autores
        cbAutores = new JComboBox();
        cbAutores.setBounds(70,150,260,20);
        this.add(cbAutores);

        //Crear y agregar boton AñadirAutor
        btAñadirAutor = new JButton("Añadir Autor");
        btAñadirAutor.setBounds(100,180,170,20); 
        btAñadirAutor.setActionCommand("añadirAutor");
        this.add(btAñadirAutor);

        btAgregarLibro = new JButton("Agregar");
        btAgregarLibro.setBounds(50,250,260,25);
        btAgregarLibro.setActionCommand("agregar");
        this.add(btAgregarLibro);

        String texto = vista.PanelEntradaDatos.getColeccion();
        lbNombreColeccion = new JLabel("Coleccion: " + texto);
        lbNombreColeccion.setFont(new Font("ARIAL",Font.BOLD,15));
        lbNombreColeccion.setBounds(15,15,140,20);
        this.add(lbNombreColeccion);

        //Caracteristicas de la ventana
        this.setTitle("Agregar libro");
        this.setSize(370,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreLibro()
    {
        return tfNombreLibro.getText();
    }

    public String getAñoLibro()
    {
        return tfAñoLibro.getText();
    }

    public static String getAutor()
    {
        return (String) cbAutores.getSelectedItem();
    }
    
    public int getIndexAutores()
    {
        return cbAutores.getSelectedIndex();
    }
    
    public void setAutor(String A)
    {
        cbAutores.addItem(A);
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarLibro.addActionListener(pAL);
    }

    //Crear Dialogo AñadirAutor
    public void crearDialogoAñadirAutor()
    {
        miDialogoAñadirAutor = new DialogoAñadirAutor();
    }

    public void cerrarDialogoAgregarLibro()
    {
        this.dispose();
    }

}
