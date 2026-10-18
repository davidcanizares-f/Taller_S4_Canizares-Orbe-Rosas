package negocio;
import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(){
        Scanner entrada = new Scanner(System.in);
        // Fecha actual (se necesita para calcular la edad)
        System.out.print("Fecha de hoy - Dia (1-31): ");
        int diaActual = entrada.nextInt();
        while (diaActual < 1 || diaActual > 31) {
            System.out.print("Dia invalido. Ingrese un dia entre 1 y 31: ");
            diaActual = entrada.nextInt();
        }

        System.out.print("Fecha de hoy - Mes (1-12): ");
        int mesActual = entrada.nextInt();
        while (mesActual < 1 || mesActual > 12) {
            System.out.print("Mes invalido. Ingrese un mes entre 1 y 12: ");
            mesActual = entrada.nextInt();
        }

        System.out.print("Fecha de hoy - Año: ");
        int anioActual = entrada.nextInt();
        while (anioActual < 1900) {
            System.out.print("Año invalido. Ingrese un año desde 1900: ");
            anioActual = entrada.nextInt();
        }
        entrada.nextLine(); //limpiar el buffer


        System.out.print("Primer nombre: ");
        String nombre = entrada.nextLine();
        while (nombre == null || nombre.isBlank()) {
            System.out.print("No puede estar vacio. Primer nombre: ");
            nombre = entrada.nextLine();
        }

        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        while (apellido == null || apellido.isBlank()) {
            System.out.print("No puede estar vacio. Apellido: ");
            apellido = entrada.nextLine();
        }

        System.out.print("Sexo (M/F): ");
        String sexo = entrada.nextLine();
        while (sexo == null || !(sexo.trim().equalsIgnoreCase("M") || sexo.trim().equalsIgnoreCase("F"))) {
            System.out.print("Valor invalido. Sexo (M/F): ");
            sexo = entrada.nextLine();
        }

        System.out.print("Dia de nacimiento (1-31): ");
        int dia = entrada.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.print("Dia invalido. Ingrese un dia entre 1 y 31: ");
            dia = entrada.nextInt();
        }

        System.out.print("Mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.print("Mes invalido. Ingrese un mes entre 1 y 12: ");
            mes = entrada.nextInt();
        }

        System.out.print("Año de nacimiento (1900-" + anioActual + "): ");
        int anio = entrada.nextInt();
        while (anio < 1900 || anio > anioActual) {
            System.out.print("Anio invalido. Ingrese un anio entre 1900 y " + anioActual + ": ");
            anio = entrada.nextInt();
        }

        System.out.print("Altura (en centimetros, hasta 300): ");
        double altura = entrada.nextDouble();
        while (altura <= 0 || altura > 300) {
            System.out.print("Altura invalida. Ingrese un valor mayor que 0 y hasta 300: ");
            altura = entrada.nextDouble();
        }

        System.out.print("Peso (en kilogramos, hasta 700): ");
        double peso = entrada.nextDouble();
        while (peso <= 0 || peso > 700) {
            System.out.print("Peso invalido. Ingrese un valor mayor que 0 y hasta 700: ");
            peso = entrada.nextDouble();
        }

        PerfilMedico p = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        int edad = p.obtenerEdad(diaActual, mesActual, anioActual);

        System.out.println("\n=== DATOS DEL PERFIL ===");
        System.out.println("> Nombre: " + p.getPrimerNombre());
        System.out.println("> Apellido: " + p.getApellido());
        System.out.println("> Sexo: " + p.getSexo());
        System.out.println("> Fecha de nacimiento: " + p.getDiaNacimiento() + "/" + p.getMesNacimiento() + "/" + p.getAnioNacimiento());
        System.out.println("> Altura: " + p.getAltura() + " cm");
        System.out.println("> Peso: " + p.getPeso() + " kg");

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("> Edad: " + edad + " anios");
        System.out.println("> BMI: " + p.getBMI() + " (" + p.getCategoriaBMI() + ")");
        System.out.println("> Frecuencia cardiaca máxim: " + p.getFrecuenciaCardiacaMaxima(edad) + " pulsos/min");
        System.out.println("> Rango de frecuencia esperada: " + p.getFrecuenciaEsperadaMinima(edad) + " - " + p.getFrecuenciaEsperadaMaxima(edad) + " pulsos/min");

        System.out.println("\n=== VALORES DE BMI ===");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o mas");

        entrada.close();
    }
}