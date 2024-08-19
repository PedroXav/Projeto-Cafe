package cafe;

public class Espresso extends Cafe {
    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double getPreco() {
        return 3.0;
    }
}

