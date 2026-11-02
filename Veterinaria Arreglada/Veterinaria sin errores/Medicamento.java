class Medicamento {
    private String nombre;
    private double precio;

    Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    String getNombre() {
        return nombre;
    }

    double getPrecio() {
        return precio;
    }

    String mostrarDatos() {
        return "Medicamento: " + nombre + " ($" + precio + ")";
    }
}