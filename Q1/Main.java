package Q1;

import entidades.Cachorro;
import entidades.Gato;
import entidades.Zoologico;
import excecoes.AgeLessThanZero;
import excecoes.NameEmpty;

public class Main{
    public static void main(String[] args){
        try{
            Cachorro cachorro = new Cachorro("Perola", 2);
            Cachorro cachorro2 = new Cachorro("Agatha", 1);
            Gato gato = new Gato("Safira", 3);

            Zoologico zoo = new Zoologico(cachorro, cachorro2, gato);
        } catch(AgeLessThanZero e){
            System.out.println(e.getMessage());
        }
    }
}