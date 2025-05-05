public class Zoologico{
    private Cachorro cachorro;
    private Gato gato;

    public Zoologico(){
        Cachorro dog = new Cachorro("Perola", 2, "Au Au");
        Gato cat = new Gato("Safira", 3, "Miau Miau");
    }

    public void emitirSom(){
        cachorro.som();
        gato.som();
    }
}