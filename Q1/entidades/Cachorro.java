package entidades;
public class Cachorro extends Animal{

    public Cachorro(String name, int age){
        super(name, age);
    }

    @Override
    public void som(){
        System.out.println("au au");
    }
}