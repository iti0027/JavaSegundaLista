package entidades;

public class Gato extends Animal{
    public Gato(String name, short age){
        super(name,age);
    }

    @Override
    public void som(){
        System.out.println("Miau.");
    }
}