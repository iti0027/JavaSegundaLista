import entidades.Cachorro;
import entidades.Gato;
import repositorio.Zoologico;

public class Main{
    public static void main(String[] args){
        Cachorro dog = new Cachorro("Irinel", 12);
        Gato cat = new Gato("Gilberto gil", 90);
        
        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(dog);
        zoo.adicionarAnimal(cat);
        zoo.emitirSom();
        
    }
}