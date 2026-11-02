class Veterinario extends Persona implements Notificable {

    private String matricula;

    Veterinario(String nombre, String telefono,
                String correo, String matricula) {
        super(nombre, telefono, correo);
        this.matricula = matricula;
    }

    String getMatricula() {
        return matricula;
    }

    @Override
    String mostrarDatos() {
        return "Veterinario: " + getNombre() +
                " (" + getTelefono() + ", " + getCorreo() +
                ") Mat. " + matricula;
    }

    @Override
    public String mensajeRecordatorio() {
        return "Recordatorio para el veterinario " +
                getNombre() + ": tiene una atencion pendiente.";
    }
}