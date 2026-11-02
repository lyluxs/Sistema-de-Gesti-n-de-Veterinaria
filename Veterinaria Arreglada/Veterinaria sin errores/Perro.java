class Perro extends Mascota {

    Perro(String nombre) {
        super(nombre, "Perro");
    }

    @Override
    String hacerSonido() {
        return "Guau guau!\n૮ • ﻌ - ა";
    }
}