package singleton;

import java.util.ArrayList;
import java.util.List;

public class PedidoSingleton {
    private static PedidoSingleton instanciaUnica;
    private List<String> itensPedido;

    private PedidoSingleton() {
        itensPedido = new ArrayList<>();
    }

    public static PedidoSingleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new PedidoSingleton();
        }
        return instanciaUnica;
    }

    public void adicionarItem(String item) {
        itensPedido.add(item);
    }

    public void mostrarPedido() {
        System.out.println("Pedido:");
        for (String item : itensPedido) {
            System.out.println(item);
        }
    }
}

