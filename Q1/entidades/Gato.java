package entidades;
public class Gato extends Animal{
    public Gato(String name, int age){
        super(name,age);
 
    }



    @Override
    public void som(){
        System.out.println("Minhau");
    }
}