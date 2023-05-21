package paquete02;

public class Medico {

    private String[] nombreDoctor, especialidad;
    private double[] sueldoMensual;
    
    public Medico(String[] n, String[] e, double[] s){
        nombreDoctor = n;
        especialidad = e;
        sueldoMensual = s;
    }

    public void establecerNombreDoctor(String[] n) {
        nombreDoctor = n;
    }

    public void establecerEspecialidad(String[] e) {
        especialidad = e;
    }

    public void establcerSueldoMensual(double[] s) {
        sueldoMensual = s;
    }

    public String[] obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String[] obtenerEspecialidad() {
        return especialidad;
    }

    public double[] obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
