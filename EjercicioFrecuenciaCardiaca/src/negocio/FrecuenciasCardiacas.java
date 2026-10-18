package negocio;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento) {
        setPrimerNombre(primerNombre);
        setApellido(apellido);
        setMesNacimiento(mesNacimiento);
        setDiaNacimiento(diaNacimiento);
        setAnioNacimiento(anioNacimiento);
    }


    public void setPrimerNombre(String primerNombre) {
        if (primerNombre != null && !primerNombre.isBlank()) {
            this.primerNombre = primerNombre.trim();
        }
    }
    public String getPrimerNombre() {
        return primerNombre;
    }


    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isBlank()) {
            this.apellido = apellido.trim();
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setMesNacimiento(int mesNacimiento) {
        if (mesNacimiento >= 1 && mesNacimiento <= 12) {
            this.mesNacimiento = mesNacimiento;
        }
    }
    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        if (diaNacimiento >= 1 && diaNacimiento <= 31) {
            this.diaNacimiento = diaNacimiento;
        }
    }
    public int getDiaNacimiento() {
        return diaNacimiento;
    }


    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento >= 1900) {
            this.anioNacimiento = anioNacimiento;
        }
    }
    public int getAnioNacimiento() {
        return anioNacimiento;
    }


    public int getEdad(int diaActual, int mesActual, int anioActual) {
        int edad = anioActual - anioNacimiento;
        // Si todavia no ha cumplido anios este anio, se resta 1
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }
        if (edad < 0) {
            edad = 0;
        }
        return edad;
    }

    // Frecuencia cardiaca maxima = 220 - edad
    public int getFrecuenciaCardiacaMaxima(int edad) {
        return 220 - edad;
    }

    // Limite inferior del rango esperado: 50% de la frecuencia maxima
    public double getFrecuenciaEsperadaMinima(int edad) {
        return getFrecuenciaCardiacaMaxima(edad) *0.50;
    }

    // Limite superior del rango esperado: 85% de la frecuencia maxima
    public double getFrecuenciaEsperadaMaxima(int edad) {
        return getFrecuenciaCardiacaMaxima(edad) * 0.85;
    }
}