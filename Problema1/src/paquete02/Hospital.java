package paquete02;

public class Hospital {

    private String nombreCiudad, provinciaCiudad;

    // Constructor
    public Hospital(String n, String p){
        nombreCiudad = n;
        provinciaCiudad = p;
    }
    
    // Metodos 
    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerProvinciaCiudad(String p) {
        provinciaCiudad = p;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvinciCiudad() {
        return provinciaCiudad;
    }
}
