package repositorio;
import java.util.ArrayList;

import entidades.Animal;

public class Zoologico implements IAnimal{
    private ArrayList<Animal> listAnimal;

    public Zoologico(){
        this.listAnimal = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal){
        listAnimal.add(animal);

    }

    public void emitirSom(){
        // for(Animal animal : listAnimal){
        //  animal.som();   
        // }

        for(int i = 0; i < listAnimal.size(); i++){
            listAnimal.get(i).som(); 
        }
    }

    @Override
    public Animal getAnimalForId(int id){
        for(int i = 0; i < listAnimal.size(); i++){
            if(listAnimal.get(i).getId() == id){
                return listAnimal.get(i);
            } 
        }
    }

    @Override
    public void updateAnimalForId
}