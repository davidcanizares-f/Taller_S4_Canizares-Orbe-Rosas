package negocio;

import javax.swing.*;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;


    public Fecha(int mes, int dia, int anio) {
        setMes(mes);
        setDia(dia);
        setAnio(anio);
    }


    public void setMes(int mes) {
        if(mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }
    public int getMes() {
        return mes;
    }


    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }
    public int getDia() {
        return dia;
    }

    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;
        }
    }
    public int getAnio() {
        return anio;
    }

    public void mostrarFecha() {
        JOptionPane.showMessageDialog(null, "Fecha (mes/dia/anio):\n"+ mes + "/" + dia + "/" + anio,"FECHA", JOptionPane.INFORMATION_MESSAGE);
    }
}