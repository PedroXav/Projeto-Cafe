package cafe;

public class FabricaCafe {
    public Cafe criarCafe(String tipo) {
        switch (tipo.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            default:
                throw new IllegalArgumentException("Tipo de café desconhecido");
        }
    }
}

