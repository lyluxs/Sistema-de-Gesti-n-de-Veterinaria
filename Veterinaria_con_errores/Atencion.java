class Atencion {
    private Veterinario veterinario;
    private Mascota mascota;
    private Medicamento medicamento;
    private double costo;

    Atencion(Veterinario veterinario, Mascota mascota,
             Medicamento medicamento, double costo) {
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.medicamento = medicamento;
        this.costo = costo;
    }

    double costoTotal() {
        return costo + medicamento.getPrecio();
    }

    String mostrarDatos() {
        return "Atencion de " + veterinario.getNombre() +
                " a " + mascota.getNombre() +
                ". Total: $" + costoTotal();
    }
}