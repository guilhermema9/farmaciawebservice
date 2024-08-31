package modelos;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {

    private String id;  // Adicionando o campo id
    private String clienteNome;
    private String clienteCpf;

    @XmlElementWrapper(name = "itensPedido")
    @XmlElement(name = "itemPedido")
    private List<ItemPedido> itensPedido;

    // Construtor padrão
    public Pedido() {
    }

    // Construtor com parâmetros
    public Pedido(String id, String clienteNome, String clienteCpf, List<ItemPedido> itensPedido) {
        this.id = id;
        this.clienteNome = clienteNome;
        this.clienteCpf = clienteCpf;
        this.itensPedido = itensPedido;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", clienteNome='" + clienteNome + '\'' +
                ", clienteCpf='" + clienteCpf + '\'' +
                ", itensPedido=" + itensPedido +
                '}';
    }
}