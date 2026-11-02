class Persona {
    private String nombre;
    private String telefono;
    private String correo;

    Persona(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    String getNombre() {
        return nombre;
    }

    String getTelefono() {
        return telefono;
    }

    String getCorreo() {
        return correo;
    }

    String mostrarDatos() {
        return "Persona: " + nombre;
    }
}