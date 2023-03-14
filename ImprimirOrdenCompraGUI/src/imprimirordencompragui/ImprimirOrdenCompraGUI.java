package imprimirordencompragui;

import javax.swing.JOptionPane;

/**
 *
 * @author maryse
 *
 * JOptiionPane Este programa calcula e imprime un reporte de orden de compra.
 *
 */
public class ImprimirOrdenCompraGUI {

    String nombreArticulo; // nombre del artículo comprado
    double precio; // precio de compra del artículo
    int cant; // número de elementos comprados

    public void orden() {

        nombreArticulo = JOptionPane.showInputDialog("Nombre del artículo comprado:");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Cantidad:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
        JOptionPane.showMessageDialog(null, "ORDEN DE COMPRA:\n\n"
                + "Artículo: " + nombreArticulo + "\nCantidad: " + cant
                + "\nPrecio total: $" + precio * cant);
    }

    public static void main(String[] args) {

        ImprimirOrdenCompraGUI compra = new ImprimirOrdenCompraGUI();
        compra.orden();
    }

}
