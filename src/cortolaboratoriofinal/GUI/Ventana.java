/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortolaboratoriofinal.GUI;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{

    public int WIDTH = 300, widthTF = 120, widhtB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JLabel lblnombre, lblcodigo, lblprecio, lblcantidad;
    public JTextField nombre, codigo, precio, cantidad;
    public JComboBox tipo;    
    ButtonGroup disponibilidad = new ButtonGroup();
    public JRadioButton no;
    public JRadioButton si;
    public JTable resultados;
    
    
    public JPanel table;
    
    public JButton buscar, actualizar, eliminar, limpiar, insertar;
    
    private static final int ANCHOC = 130, ALTOC = 30;
    
    DefaultTableModel tm;
    
    public Consulta(){
        super("Inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        llenarTabla();
        Container container = getContentPane();
        container.add(lblnombre);
        container.add(lblcodigo);
        container.add(lblprecio);
        container.add(lblcantidad);
        container.add(disponibilidad);
        container.add(si);
        container.add(no);
        container.add(buscar);
        container.add(insertar);
        container.add(actualizar);
        container.add(eliminar);
        container.add(limpiar);
        container.add(table);
        setSize(600, 600);
        eventos();        
    }
    
    public final void agregarLabels(){
        lblCodigo = new JLabel("Codigo");
    }
}
