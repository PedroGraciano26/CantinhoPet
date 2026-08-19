package Loja;

public class Acessorio extends Produto implements Promocionavel{
    private String material;
    private Enum categoria;

    public Acessorio(String codigo, String nome, double preco, int qntestoque, String material, Enum categoria) {
        super(codigo, nome, preco, qntestoque);
        this.material = material;
        this.categoria = categoria;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Enum getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Enum categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "Acessorio{material='" + this.material + "', categoria=" + String.valueOf(this.categoria) + "}";
    }


    @Override
    public double aplicarPromocao(double valorDesconto) {
        double precoComDesconto = getPreco() + (100-valorDesconto)/100;
        return valorDesconto;
    }
}