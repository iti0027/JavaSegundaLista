package excecoes;

public class AgeLessThanZero extends RuntimeException{
    public AgeLessThanZero(){
        super("Idade não pode ser abaixo de zero.");
    }
}
