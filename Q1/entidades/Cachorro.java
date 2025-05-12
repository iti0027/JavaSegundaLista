package entidades;

public class Cachorro extends Animal{
    public Cachorro(String name, Short age){
        super(name, age);
    }

    @Override
    public void som(){
        System.out.println("Au au.");
    }
}