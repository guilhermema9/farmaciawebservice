package modelos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Medicamento {

    private String codigo;
    private String fabricante;
    private String nome;
    private double preco;

    // Construtor padrão
    public Medicamento() {
    }

    // Construtor com parâmetros
    public Medicamento(String codigo, String fabricante, String nome, double preco) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "codigo='" + codigo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}