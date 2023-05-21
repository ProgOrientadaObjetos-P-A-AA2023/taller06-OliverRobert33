package paquete02;

/**
 * @author OLIVER SARAGURO
 */
public class EntidadHospitalaria {

    private String nombreHospital, direccionHospital;
    private double totalSueldos;
    private int nmroEspecialidades;

    private Hospital hospital;
    private Medico medico;
    private Enfermero enfermero;

    public EntidadHospitalaria(String n, String d, Hospital h, Medico m, Enfermero e) {
        nombreHospital = n;
        direccionHospital = d;
        hospital = h;
        medico = m;
        enfermero = e;
    }

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerDireccionHospital(String d) {
        nombreHospital = d;
    }

    public void establecerHospital(Hospital h) {
        hospital = h;
    }

    public void establecerMedico(Medico m) {
        medico = m;
    }

    public void establecerEnfermero(Enfermero e) {
        enfermero = e;
    }

    public void calcularTotalSueldos() {
        double suma = 0;
        for (int i = 0; i < medico.obtenerSueldoMensual().length; i++) {
            suma = suma + medico.obtenerSueldoMensual()[i];
        }
        for (int i = 0; i < enfermero.obtenerSueldoMensual().length; i++) {
            suma = suma + enfermero.obtenerSueldoMensual()[i];
        }
        totalSueldos = suma;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public String obtenerDireccionHospital() {
        return direccionHospital;
    }

    public Hospital establecerHospital() {
        return hospital;
    }

    public Medico establecerMedico() {
        return medico;
    }

    public Enfermero establecerEnfermero() {
        return enfermero;
    }

    public double obtenerTotalSueldos() {
        return totalSueldos;
    }

    @Override
    public String toString() {
        String mensaje = String.format(""
                + "HOSPITAL %s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos\n",
                obtenerNombreHospital(),
                obtenerDireccionHospital(),
                hospital.obtenerNombreCiudad(),
                hospital.obtenerProvinciCiudad(),
                medico.obtenerEspecialidad().length);

        for (int i = 0; i < medico.obtenerNombreDoctor().length; i++) {
            mensaje = String.format(""
                    + "%s "
                    + "- %s - sueldo: %.0f - %s\n",
                    mensaje,
                    medico.obtenerNombreDoctor()[i],
                    medico.obtenerSueldoMensual()[i],
                    medico.obtenerEspecialidad()[i]);
        }

        mensaje = String.format(""
                + "%s\n"
                + "Listado de enfermeros(as)\n",
                mensaje);

        for (int i = 0; i < enfermero.obtenerNombreEnfermero().length; i++) {
            mensaje = String.format(""
                    + "%s "
                    + "- %s - sueldo: %.0f - %s\n",
                    mensaje,
                    enfermero.obtenerNombreEnfermero()[i],
                    enfermero.obtenerSueldoMensual()[i],
                    enfermero.obtenerTipo()[i]);
        }

        mensaje = String.format(""
                + "%s\n"
                + "Total sueldos a pagar por mes: %.0f",
                mensaje,
                obtenerTotalSueldos());

        return mensaje;
    }
}
