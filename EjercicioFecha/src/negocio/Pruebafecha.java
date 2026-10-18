package negocio;
import javax.swing.JOptionPane;

public class Pruebafecha {
    public static void main() {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes (1-12):"));
        while (mes < 1 || mes > 12) {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Mes invalido. Ingrese un mes entre 1 y 12:"));
        }

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia (1-31):"));
        while (dia < 1 || dia > 31) {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Dia invalido. Ingrese un dia entre 1 y 31:"));
        }

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año:"));
        while (anio < 1) {
            anio = Integer.parseInt(JOptionPane.showInputDialog("Año invalido. Ingrese un anio mayor que 0:"));
        }

        Fecha fecha = new Fecha(mes, dia, anio);

        //JOptionPane.showMessageDialog(null, "Fecha ingresada (mes/dia/anio):");
        fecha.mostrarFecha();

        // Un mes invalido no modifica el valor
        fecha.setMes(13);
        JOptionPane.showMessageDialog(null,
                "Se intento establecer el mes 13 (invalido).\nMes actual: " + fecha.getMes(), "PRUEBA DE ERROR", JOptionPane.INFORMATION_MESSAGE);

        // Valores validos con set y get
        fecha.setMes(9);
        fecha.setDia(27);
        fecha.setAnio(2007);
        JOptionPane.showMessageDialog(null,
                "Fecha modificada con los metodos set:"
                        + "\nMes: " + fecha.getMes()
                        + "\nDia: " + fecha.getDia()
                        + "\nAnio: " + fecha.getAnio());

        fecha.mostrarFecha();
    }
}