package decorator;

import cafe.Cafe;

public abstract class CafeDecorator extends Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    @Override
    public double getPreco() {
        return cafeDecorado.getPreco();
    }
}

