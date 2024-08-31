package daos;

import java.util.ArrayList;
import java.util.List;

import modelos.ItemPedido;
import modelos.Medicamento;
import modelos.Pedido;

public class PedidoDAO {

    private static List<Pedido> pedidos;

    static {
        pedidos = new ArrayList<>();

        Medicamento med1 = new Medicamento("001", "EMS", "Paracetamol", 4.99);
        Medicamento med2 = new Medicamento("002", "Sanofi", "Dipirona", 3.49);
        Medicamento med3 = new Medicamento("003", "Bayer", "Amoxicilina", 19.99);

        List<ItemPedido> itensPedido1 = new ArrayList<>();
        itensPedido1.add(new ItemPedido(med1, 2));
        itensPedido1.add(new ItemPedido(med2, 1));

        List<ItemPedido> itensPedido2 = new ArrayList<>();
        itensPedido2.add(new ItemPedido(med3, 3));

        List<ItemPedido> itensPedido3 = new ArrayList<>();
        itensPedido3.add(new ItemPedido(med1, 1));
        itensPedido3.add(new ItemPedido(med3, 2));

        pedidos.add(new Pedido("1", "João Silva", "123.456.789-00", itensPedido1));
        pedidos.add(new Pedido("2", "Maria Oliveira", "987.654.321-00", itensPedido2));
        pedidos.add(new Pedido("3", "Carlos Souza", "111.222.333-44", itensPedido3));
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public List<Pedido> listarPedidosPaginacao(int numeroDaPagina, int tamanhoDaPagina) {
        int indiceInicial = numeroDaPagina * tamanhoDaPagina;
        int indiceFinal = indiceInicial + tamanhoDaPagina;

        indiceFinal = indiceFinal > pedidos.size() ? pedidos.size() : indiceFinal;
        indiceInicial = indiceInicial > indiceFinal ? indiceFinal : indiceInicial;

        return pedidos.subList(indiceInicial, indiceFinal);
    }

    public Pedido buscarPedidoPorId(String id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null;  
    }

    public void criarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}