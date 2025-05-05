package repositorio;
import entidades.*;

public interface IAnimal {
    void getAllAnimals();
    Animal getAnimalForId(int id);
    void updateAnimalForId(int id, String newName);
    void deleteAnimnalForId(int id);
}
