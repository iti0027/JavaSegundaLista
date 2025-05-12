package Q3.execoes;

public class salarioBase extends RuntimeException {
    public salarioBase() {
        super("O salário base deve ser maior do que 800");
    }
}