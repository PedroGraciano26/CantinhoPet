package Loja;

public class Racao extends Produto {
    private String validade;
    private String sabor;

    public Racao(String codigo, String nome, double preco, int qntestoque, String validade, String sabor) {
        super(codigo, nome, preco, qntestoque);
        this.validade = validade;
        this.sabor = sabor;
    }

    public String getValidade() {
        return this.validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "Racao{validade='" + this.validade + "', sabor='" + this.sabor + "'}";
    }
}