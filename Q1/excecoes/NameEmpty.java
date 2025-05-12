package excecoes;

public class NameEmpty extends  RuntimeException{
    public NameEmpty(){
        super("Nome esta vazio.");
    }
}
