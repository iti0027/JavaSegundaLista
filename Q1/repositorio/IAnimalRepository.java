package repositorio;
import entidades.*;

public interface IAnimalRepository {
    Animal getAnimalByName(String name);

    void save(Animal animal);

    void deleteAnimalByName(String name);

    void updateAnimalByName(String actualName, String newName);
}