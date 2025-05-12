package entidades;

public class Zoologico {
    private Cachorro cachorro;
    private Gato gato;

    public Zoologico(Cachorro cachorro, Gato gato){
        this.cachorro = cachorro;
        this.gato = gato;
    }

    public void expressarSom(){
        cachorro.som();
        gato.som();
    }
}
