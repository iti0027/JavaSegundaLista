public class Gato extends Animal{
    private String miar;
    public Gato(String name, int age, String miar){
        super(name,age);
        this.miar = miar;
    }

    public String getMiar(){
        return miar;
    }

    public void setMiar(String miar){
        this.miar = miar;
    }

    @Override
    public void som(){
        System.out.println(getMiar());
    }
}