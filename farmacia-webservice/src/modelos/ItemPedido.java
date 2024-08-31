package modelos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ItemPedido {

    private Medicamento medicamento;
    private int quantidade;

    // Construtor padrão
    public ItemPedido() {
    }

    // Construtor com parâmetros
    public ItemPedido(Medicamento medicamento, int quantidade) {
        this.medicamento = medicamento;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "medicamento=" + medicamento +
                ", quantidade=" + quantidade +
                '}';
    }
}

