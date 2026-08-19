package Loja;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int qntestoque;

    public Produto(String codigo, String nome, double preco, int qntestoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qntestoque = qntestoque;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntestoque() {
        return this.qntestoque;
    }

    public void setQntestoque(int qntestoque) {
        this.qntestoque = qntestoque;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "Produto{codigo='" + this.codigo + "', nome='" + this.nome + "', preco=" + this.preco + ", qntestoque=" + this.qntestoque + "}";
    }
}