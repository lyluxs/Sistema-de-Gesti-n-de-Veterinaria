class Mascota {
    private String nombre;
    private String especie;

    Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    String getNombre() {
        return nombre;
    }

    String getEspecie() {
        return especie;
    }

    String hacerSonido() {
        return "...";
    }

    String mostrarDatos() {
        return "Mascota: " + nombre + " (" + especie + ")";
    }
}