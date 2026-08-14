package Loja;

public class Acessorio extends Produto{
    private String material;
    private Enum categoria;

    public Acessorio(String codigo, String nome, double preco, int qntestoque, String material, Enum categoria) {
        super(codigo, nome, preco, qntestoque);
        this.material = material;
        this.categoria = categoria;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Enum getCategoria() {
        return categoria;
    }

    public void setCategoria(Enum categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Acessorio{" +
                "material='" + material + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
