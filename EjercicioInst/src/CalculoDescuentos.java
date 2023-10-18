import javax.swing.JOptionPane;

public class CalculoDescuentos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos:"));

        double[] precios = new double[n];
        double[] descuentos = new double[n];

        int sinDescuento = 0;
        int descuento5 = 0;
        int descuento8 = 0;
        int descuento10 = 0;

        double totalVentas = 0.0;

        for (int i = 0; i < n; i++) {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo " + (i + 1) + ":"));
            precios[i] = precio;

            if (precio >= 1 && precio <= 10000) {
                descuentos[i] = 0.0;
                sinDescuento++;
            } else if (precio <= 20000) {
                descuentos[i] = 0.05;
                descuento5++;
            } else if (precio <= 30000) {
                descuentos[i] = 0.08;
                descuento8++;
            } else {
                descuentos[i] = 0.10;
                descuento10++;
            }

            totalVentas += precios[i] - (precios[i] * descuentos[i]);
        }

        JOptionPane.showMessageDialog(null, "Cuantos artículos se procesaron: " + n
                + "\nCuantos artículos con descuento del 0%: " + sinDescuento
                + "\nCuantos artículos con descuento del 5%: " + descuento5
                + "\nCuantos artículos con descuento del 8%: " + descuento8
                + "\nCuantos artículos con descuento del 10% en adelante: " + descuento10
                + "\nValor total en ventas de los " + n + " artículos: " + totalVentas);
    }
}