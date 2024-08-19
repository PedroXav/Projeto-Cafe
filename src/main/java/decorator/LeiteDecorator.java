package decorator;

import cafe.Cafe;

public class LeiteDecorator extends CafeDecorator {

    public LeiteDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Leite";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.0;
    }
}

