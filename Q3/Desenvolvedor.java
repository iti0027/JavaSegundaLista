package Q3;

public class Desenvolvedor extends Funcionarios {
    private double produtividade;

    public Desenvolvedor(String nome, double salarioBase, double produtividade){
        super(nome, salarioBase);
        this.produtividade = produtividade;
    }

    public double getProdutividade(){
        return produtividade;
    }

    public void setProdutividade(double produtividade){
        this.produtividade = getSalarioBase() * produtividade;
    }

    @Override
    public double calcularSalario(){
        return getProdutividade();
    }
}
