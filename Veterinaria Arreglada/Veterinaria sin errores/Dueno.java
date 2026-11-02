class Dueno extends Persona implements Notificable {

    Dueno(String nombre, String telefono, String correo) {
        super(nombre, telefono, correo);
    }

    @Override
    String mostrarDatos() {
        return "Dueno: " + getNombre() +
                " (" + getTelefono() + ", " + getCorreo() + ")";
    }

    @Override
    public String mensajeRecordatorio() {
        return "Recordatorio para " + getNombre() +
                ": recuerde llevar su mascota al veterinario.";
    }
}