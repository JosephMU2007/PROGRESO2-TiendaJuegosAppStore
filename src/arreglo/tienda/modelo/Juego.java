package arreglo.tienda.modelo;

public class Juego {
    private String nombre;
    private String categoria;
    private int memoria;
    private double precio;
    private int LicenciasDisponibles;
    private int LicenciasVendidas;


    public Juego(String nombre, String categoria, int memoria, double precio, int licenciasDisponibles) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.memoria = memoria;
        this.precio = precio;
        LicenciasDisponibles = licenciasDisponibles;
        LicenciasVendidas=0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        if(nombre !=null && !nombre.trim().isEmpty())
            this.categoria = categoria;
    }

    public void setMemoria(int memoria) {
        if (memoria > 0)
          this.memoria = memoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
