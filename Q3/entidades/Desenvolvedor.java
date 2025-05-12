package Q3.entidades;

public class Desenvolvedor extends Funcionarios {
    private double fatorProdutividade;

    public Desenvolvedor(String nome, double salarioBase, double fatorProdutividade) {
        super(nome, salarioBase);
        this.fatorProdutividade = fatorProdutividade;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()*fatorProdutividade;
    }

    public double getFatorProdutividade() {
        return fatorProdutividade;
    }

    public void setFatorProdutividade(double fatorProdutividade) {
        this.fatorProdutividade = fatorProdutividade;
    }
}
