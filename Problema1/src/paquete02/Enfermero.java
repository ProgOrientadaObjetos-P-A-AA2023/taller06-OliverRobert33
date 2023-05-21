package paquete02;

public class Enfermero {

    private String [] nombreEnfermero, tipo;
    private double [] sueldoMensual;

    public Enfermero(String [] n, String[]t, double[] s) {
        nombreEnfermero = n;
        tipo = t;
        sueldoMensual = s;
    }

    public void establcerNombreEnfermero(String[] n) {
        nombreEnfermero = n;
    }

    public void establecerTipo(String[] t) {
        tipo = t;
    }

    public void establecerSueldoMensual(double[] s) {
        sueldoMensual = s;
    }

    public String[] obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public String[] obtenerTipo() {
        return tipo;
    }

    public double[] obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
