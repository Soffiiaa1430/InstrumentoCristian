import javax.swing.JOptionPane;

public class Ejercicio2 {
	    public static void main(String[] args) {
	        int numMeses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses a calcular:"));
	        double[] ventasMensuales = new double[numMeses];

	        for (int i = 0; i < numMeses; i++) {
	            String input = JOptionPane.showInputDialog("Ingrese las ventas del mes " + (i + 1) + ":");
	            ventasMensuales[i] = Double.parseDouble(input);
	        }

	        double sumaVentas = 0;
	        double maxVentas = ventasMensuales[0];
	        double minVentas = ventasMensuales[0];
	        int mesMaxVentas = 1;
	        int mesMinVentas = 1;

	        for (int i = 0; i < numMeses; i++) {
	            sumaVentas += ventasMensuales[i];

	            if (ventasMensuales[i] > maxVentas) {
	                maxVentas = ventasMensuales[i];
	                mesMaxVentas = i + 1;
	            }

	            if (ventasMensuales[i] < minVentas) {
	                minVentas = ventasMensuales[i];
	                mesMinVentas = i + 1;
	            }
	        }

	        double promedioMensual = sumaVentas / numMeses;

	        String resultado = "Promedio Mensual: " + promedioMensual + "\n"
	                + "Mes con Ventas Más Altas (Mes " + mesMaxVentas + "): " + maxVentas + "\n"
	                + "Mes con Ventas Más Bajas (Mes " + mesMinVentas + "): " + minVentas;

	        JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
	    }
}
