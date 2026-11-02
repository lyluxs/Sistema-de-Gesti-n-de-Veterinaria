class Main {

    public static void main(String[] args) {

        Dueno marta = new Dueno(
                "Marta", "099111222", "marta@mail.com"
        );

        Veterinario raul = new Veterinario(
                "Raul", "098333444", "raul@vet.com", "V-15"
        );

        Perro rex = new Perro("Rex");

        Mascota mascotaGato = new Gato("Michi");

        Medicamento vacuna = new Medicamento(
                "Vacuna antirrabica", 500.0
        );

        Atencion atencion = new Atencion(
                raul, rex, vacuna, 800.0
        );

        // Mostrar datos originales ;D
        System.out.println(marta.mostrarDatos());
        System.out.println(raul.mostrarDatos());
        System.out.println(rex.mostrarDatos());
        System.out.println(atencion.mostrarDatos());

        // Polimorfismo con Persona :0
        System.out.println("\n--- POLIMORFISMO PERSONA ૮₍ ´• ˕ •` ₎ა---");

        Persona persona = marta;
        System.out.println(persona.mostrarDatos());

        persona = raul;
        System.out.println(persona.mostrarDatos());

        // Polimorfismo con Mascota >:)
        System.out.println("\n--- POLIMORFISMO MASCOTA ₊˚⊹---");

        Mascota mascota = rex;
        System.out.println(mascota.hacerSonido());

        mascota = mascotaGato;
        System.out.println(mascota.hacerSonido());

        // Interfaz Notificable waos
        System.out.println("\n--- RECORDATORIOS zᶻ ૮˶- ﻌ -˶ა⌒)ᦱ---");

        System.out.println(marta.mensajeRecordatorio());
        System.out.println(raul.mensajeRecordatorio());
    }
}