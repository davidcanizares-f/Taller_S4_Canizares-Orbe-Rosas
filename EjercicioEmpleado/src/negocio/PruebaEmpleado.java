package negocio;

import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main() {
        //Empleado 1
        String nombre1 = JOptionPane.showInputDialog("Empleado 1 - Primer nombre:");
        while (nombre1 == null || nombre1.isBlank()) {
            nombre1 = JOptionPane.showInputDialog("No puede estar vacio. Primer nombre:");
        }

        String apellido1 = JOptionPane.showInputDialog("Empleado 1 - Apellido paterno:");
        while (apellido1 == null || apellido1.isBlank()) {
            apellido1 = JOptionPane.showInputDialog("No puede estar vacio. Apellido paterno:");
        }

        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 1 - Salario mensual:"));
        while (salario1 <= 0) {
            salario1 = Double.parseDouble(JOptionPane.showInputDialog("El salario debe ser positivo. Salario mensual:"));
        }

        Empleado e1= new Empleado(nombre1, apellido1, salario1);

        //empleado 2
        String nombre2 = JOptionPane.showInputDialog("Empleado 2 - Primer nombre:");
        while (nombre2 == null || nombre2.isBlank()) {
            nombre2 = JOptionPane.showInputDialog("No puede estar vacio. Primer nombre:");
        }

        String apellido2 = JOptionPane.showInputDialog("Empleado 2 - Apellido paterno:");
        while (apellido2 == null || apellido2.isBlank()) {
            apellido2 = JOptionPane.showInputDialog("No puede estar vacio. Apellido paterno:");
        }

        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 2 - Salario mensual:"));
        while (salario2 <= 0) {
            salario2 = Double.parseDouble(JOptionPane.showInputDialog("El salario debe ser positivo. Salario mensual:"));
        }

        Empleado e2= new Empleado(nombre2, apellido2, salario2);

        //antes de aumento
        JOptionPane.showMessageDialog(null,
                e1.getPrimerNombre() + " " + e1.getApellidoPaterno() + ": $" + e1.getSalarioAnual() + "\n"
                        + e2.getPrimerNombre() + " " + e2.getApellidoPaterno() + ": $" + e2.getSalarioAnual(),
                "Salario anual ANTES del aumento", JOptionPane.INFORMATION_MESSAGE);

        // Aumento del 10%
        e1.setSalarioMensual(e1.getSalarioMensual() * 1.10);
        e2.setSalarioMensual(e2.getSalarioMensual() * 1.10);

        //despues de aumento
        JOptionPane.showMessageDialog(null,
                e1.getPrimerNombre() + " " + e1.getApellidoPaterno() + ": $" + e1.getSalarioAnual() + "\n"
                        + e2.getPrimerNombre() + " " + e2.getApellidoPaterno() + ": $" + e2.getSalarioAnual(),
                "Salario anual DESPUES del aumento del 10%", JOptionPane.INFORMATION_MESSAGE);
    }

}