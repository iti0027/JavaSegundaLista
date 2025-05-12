package repositorio;
import entidades.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepositorio implements IAnimalRepository{
    private List<Animal> animals;

    public AnimalRepositorio(){
        animals = new ArrayList<Animal>();
    }

    @Override
    public Animal getAnimalByName(String name){
        return animals.stream()
        .filter(animal -> animal.getName().equals(name))
        .findFirst()
        .orElse(null);
    }

    @Override
    public void save(Animal animal){
        animals.add(animal);
    }

    @Override
    public void deleteAnimalByName(String name){
        Animal animal = getAnimalByName(name);
        animals.remove(animal);
    }

    @Override
    public void updateAnimalByName (String actualName, String newName){
        Animal animal = getAnimalByName(newName);
        animal.setName(newName);
    }
}
