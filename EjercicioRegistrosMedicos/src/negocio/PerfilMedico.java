package negocio;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int diaNacimiento, int mesNacimiento, int anioNacimiento, double altura, double peso) {
        setPrimerNombre(primerNombre);
        setApellido(apellido);
        setSexo(sexo);
        setDiaNacimiento(diaNacimiento);
        setMesNacimiento(mesNacimiento);
        setAnioNacimiento(anioNacimiento);
        setAltura(altura);
        setPeso(peso);
    }

    public void setPrimerNombre(String primerNombre) {
        if(primerNombre != null && !primerNombre.isBlank()){
            this.primerNombre = primerNombre;
        }

    }
    public String getPrimerNombre(){
        return primerNombre;
    }

    public void setApellido(String apellido){
        if(apellido != null && !apellido.isBlank()){
            this.apellido= apellido;
        }
    }
    public String getApellido() {
        return apellido;
    }

    public void setSexo(String sexo) {
        if (sexo != null && !sexo.isBlank()) {
            String valor = sexo.trim().toUpperCase();
            if (valor.equals("M") || valor.equals("F")) {
                this.sexo = valor;
            }
        }
    }
    public String getSexo(){
        return sexo;
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

    public void setAltura(double altura) {
        if (altura > 0 && altura <= 300) {
            this.altura = altura;
        }
    }
    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        if (peso > 0 && peso <= 700) {
            this.peso = peso;
        }
    }
    public double getPeso() {
        return peso;
    }

    public int obtenerEdad(int diaActual, int mesActual, int anioActual) {
        int edad = anioActual - anioNacimiento;
        // Si todavia no ha cumplido años ese año, se resta 1
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }
        if (edad < 0) {
            edad = 0;
        }
        return edad;
    }

    public int getFrecuenciaCardiacaMaxima(int edad){
        return 220-edad;
    }

    public double getFrecuenciaEsperadaMinima(int edad) {
        return getFrecuenciaCardiacaMaxima(edad) * 0.50;
    }

    public double getFrecuenciaEsperadaMaxima(int edad) {
        return getFrecuenciaCardiacaMaxima(edad) * 0.85;
    }

    public double getBMI(){
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }
    public String getCategoriaBMI() {
        double bmi = getBMI();
        if (bmi< 18.5) return "Bajo peso";
        else if (bmi< 25) return "Normal";
        else if (bmi< 30) return "Sobrepeso";
        else return "Obeso";
    }

}

