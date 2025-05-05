package Q3;

public class Main {
    public static void main(String[] args){
        Gerente manager = new Gerente("Ítalo", 18.500, 3.500);
        Desenvolvedor dev = new Desenvolvedor("Carlos", 9.000, 0.5);
        Estagiario escravo = new Estagiario("Arthur", 1.100);

        manager.calcularSalario();
        dev.calcularSalario();
        escravo.calcularSalario();
    }
}
