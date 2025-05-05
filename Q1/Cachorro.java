public class Cachorro extends Animal{
    private String latir;
    public Cachorro(String name, int age, String latir){
        super(name, age);
        this.latir = latir;
    }

    public String getLatir(){
        return latir;
    }
    public void setLatir(String latir){
        this.latir = latir;
    }

    @Override
    public void som(){
        System.out.println(getLatir());
    }
}