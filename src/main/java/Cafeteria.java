import cafe.Cafe;
import cafe.FabricaCafe;
import decorator.AcucarDecorator;
import decorator.LeiteDecorator;
import singleton.PedidoSingleton;

public class Cafeteria {
    public static void main(String[] args) {
        FabricaCafe fabrica = new FabricaCafe();
        
        // Criar cafés
        Cafe espresso = fabrica.criarCafe("espresso");
        Cafe latte = fabrica.criarCafe("latte");
        
        // Decorar os cafés
        Cafe latteComLeite = new LeiteDecorator(latte);
        Cafe espressoComAcucar = new AcucarDecorator(espresso);
        
        // Adicionar ao pedido (Singleton)
        PedidoSingleton pedido = PedidoSingleton.getInstancia();
        pedido.adicionarItem(latteComLeite.getDescricao() + " - R$ " + latteComLeite.getPreco());
        pedido.adicionarItem(espressoComAcucar.getDescricao() + " - R$ " + espressoComAcucar.getPreco());
        
        // Mostrar pedido
        pedido.mostrarPedido();
    }
}
