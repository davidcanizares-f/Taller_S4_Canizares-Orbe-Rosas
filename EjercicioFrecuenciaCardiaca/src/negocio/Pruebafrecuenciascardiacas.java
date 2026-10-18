package negocio;

import javax.swing.JOptionPane;

public class Pruebafrecuenciascardiacas {
    public static void main() {
        // Fecha actual (se necesita para calcular la edad)
        int diaActual = Integer.parseInt(JOptionPane.showInputDialog("Fecha de hoy - Dia (1-31):"));
        while (diaActual < 1 || diaActual > 31) {
            diaActual = Integer.parseInt(JOptionPane.showInputDialog("Dia invalido. Ingrese un dia entre 1 y 31:"));
        }

        int mesActual = Integer.parseInt(JOptionPane.showInputDialog("Fecha de hoy - Mes (1-12):"));
        while (mesActual < 1 || mesActual > 12) {
            mesActual = Integer.parseInt(JOptionPane.showInputDialog("Mes invalido. Ingrese un mes entre 1 y 12:"));
        }

        int anioActual = Integer.parseInt(JOptionPane.showInputDialog("Fecha de hoy - Año:"));
        while (anioActual < 1900) {
            anioActual = Integer.parseInt(JOptionPane.showInputDialog("Año invalido. Ingrese un año desde 1900:"));
        }

        // Datos de la persona
        String nombre = JOptionPane.showInputDialog("Primer nombre:");
        while (nombre == null || nombre.isBlank()) {
            nombre = JOptionPane.showInputDialog("No puede estar vacio. Primer nombre:");
        }

        String apellido = JOptionPane.showInputDialog("Apellido:");
        while (apellido == null || apellido.isBlank()) {
            apellido = JOptionPane.showInputDialog("No puede estar vacio. Apellido:");
        }

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento (1-12):"));
        while (mes < 1 || mes > 12) {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Mes invalido. Ingrese un mes entre 1 y 12:"));
        }

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de nacimiento (1-31):"));
        while (dia < 1 || dia > 31) {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Dia invalido. Ingrese un dia entre 1 y 31:"));
        }

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento (1900-" + anioActual + "):"));
        while (anio < 1900 || anio > anioActual) {
            anio = Integer.parseInt(JOptionPane.showInputDialog("Año invalido. Ingrese un año entre 1900 y " + anioActual + ":"));
        }

        Frecuenciascardiacas persona = new Frecuenciascardiacas(nombre, apellido, mes, dia, anio);

        int edad = persona.getEdad(diaActual, mesActual, anioActual);

        String mensaje = "Nombre: " + persona.getPrimerNombre()
                + "\nApellido: " + persona.getApellido()
                + "\nFecha de nacimiento: " + persona.getMesNacimiento() + "/"
                + persona.getDiaNacimiento() + "/" + persona.getAnioNacimiento()
                + "\n\nEdad: " + edad + " años"
                + "\nFrecuencia cardiaca maxima: " + persona.getFrecuenciaCardiacaMaxima(edad) + " pulsos/min"
                + "\nRango de frecuencia esperada: " + persona.getFrecuenciaEsperadaMinima(edad)
                + " - " + persona.getFrecuenciaEsperadaMaxima(edad) + " pulsos/min"
                + "\n\nNota: son estimaciones de la AHA. Consulte a un medico antes de"
                + "\nempezar o modificar un programa de ejercicios.";

        JOptionPane.showMessageDialog(null, mensaje, "Frecuencias Cardiacas", JOptionPane.INFORMATION_MESSAGE);
    }
}