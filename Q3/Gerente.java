package Q3;

public class Gerente extends Funcionarios {
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo){
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    public double getBonusFixo(){
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo){
        this.bonusFixo = getSalarioBase() + bonusFixo;
    }

    @Override
    public double calcularSalario(){
        return getBonusFixo();
    }
}
