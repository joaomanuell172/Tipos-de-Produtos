public class Eletronico extends Produto {
    private int garantia; // Em meses

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Garantia: " + garantia + " meses");
    }
}
