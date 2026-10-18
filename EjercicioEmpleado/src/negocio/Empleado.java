package negocio;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        setPrimerNombre(primerNombre);
        setApellidoPaterno(apellidoPaterno);
        setSalarioMensual(salarioMensual);
    }

    public void setPrimerNombre(String primerNombre) {
        if(primerNombre != null && !primerNombre.isBlank()) {
            this.primerNombre = primerNombre.trim();
        }
    }
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        if (apellidoPaterno != null && !apellidoPaterno.isBlank()) {
            this.apellidoPaterno = apellidoPaterno.trim();
        }
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }
    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double getSalarioAnual() {
        return salarioMensual * 12;
    }
}