package decorator;

import cafe.Cafe;

public class AcucarDecorator extends CafeDecorator {

    public AcucarDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Açúcar";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 0.5;
    }
}

