package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.EntidadHospitalaria;
import paquete02.Hospital;
import paquete02.Medico;
import paquete02.Enfermero;

/**
 * @author OLIVER SARAGURO
 */
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreHospital, direccionHospital, nombreCiudad, provinciaCiudad;

        String[] nombreDoctor, especialidadDoctor, nombreEnfermero, tipoEnfermero;
        double[] sueldoDoctor, sueldoeEnfermero;
        int nmroEspecialidades, numero;

        // Ingresen por teclado
        System.out.println("Ingrese el Nombre del hospital:");
        nombreHospital = entrada.nextLine();

        System.out.println("Ingrese la Direccion del hospital:");
        direccionHospital = entrada.nextLine();

        System.out.println("Ingrese la Ciudad del hospital:");
        nombreCiudad = entrada.nextLine();

        System.out.println("Ingrese la Provincia de la Ciudad:");
        provinciaCiudad = entrada.nextLine();
        Hospital hospital = new Hospital(nombreCiudad, provinciaCiudad);

        Medico medico = null;
        System.out.println("Ingrese el número de Doctores a ingresar:");
        numero = entrada.nextInt();
        nombreDoctor = new String[numero];
        especialidadDoctor = new String[numero];
        sueldoDoctor = new double[numero];
        for (int i = 0; i < numero; i++) {
            entrada.nextLine();

            System.out.println("Ingrese el nombre del Doctor " + (i + 1) + ":");
            nombreDoctor[i] = entrada.nextLine();

            System.out.println("Ingrese la especialidad del Doctor:");
            especialidadDoctor[i] = entrada.nextLine();

            System.out.println("Ingrese el sueldo mensual del Doctor:");
            sueldoDoctor[i] = entrada.nextDouble();
//            entrada.nextLine();
            medico = new Medico(nombreDoctor, especialidadDoctor,
                    sueldoDoctor);
        }

        String cadena;
        Enfermero enfermero = null;
        System.out.println("Ingrese el número de Enfermeros a ingresar:");
        numero = entrada.nextInt();
        nombreEnfermero = new String[numero];
        tipoEnfermero = new String[numero];
        sueldoeEnfermero = new double[numero];

        entrada.nextLine();
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese el nombre del Enfermero " + (i + 1) + ":");
            nombreEnfermero[i] = entrada.nextLine();

            System.out.println("Ingrese el tipo (nombramiento o contrato):");
            tipoEnfermero[i] = entrada.nextLine();

            System.out.println("Ingrese el sueldo mensual del Enfermero:");
            sueldoeEnfermero[i] = entrada.nextDouble();
            entrada.nextLine();
            cadena = String.format("- ");
            enfermero = new Enfermero(nombreEnfermero,
                    tipoEnfermero, sueldoeEnfermero);
        }
        


        EntidadHospitalaria entidadHospitalaria = new EntidadHospitalaria
        (nombreHospital, direccionHospital, hospital, medico, enfermero);
        
        // Lamar el metodo para calcular la suma de los sueldos.
        entidadHospitalaria.calcularTotalSueldos();
        // Presentar en pantalla los resultados
        System.out.println("----------------------------------------------");
        System.out.println(entidadHospitalaria);
        System.out.println("----------------------------------------------");

    }

}
