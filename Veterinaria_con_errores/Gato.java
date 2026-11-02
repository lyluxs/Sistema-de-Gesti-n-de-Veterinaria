class Gato extends Mascota {

    Gato(String nombre) {
        super(nombre, "Gato");
    }

    @Override
    String hacerSonido() {
        return "Miau!\nฅ^•ﻌ•^ฅ";
    }
}