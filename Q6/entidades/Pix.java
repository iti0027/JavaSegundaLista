package Q6.entidades;


public class Pix extends MetodoPagamento{

    public Pix(double taxa){
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor) {
        return true;
    }
}
