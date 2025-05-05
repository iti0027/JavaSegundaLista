package Q2;

public class Main {
    public static void main(String[] args){
        Carro car = new Carro("BYD", "hatchbacks", 2024, 4);
        Moto motocycle = new Moto("BMW Motorrad", "G 310 GS", 2022, "Elétrico");

        car.informacoes();
        motocycle.informacoes();
    }
}
