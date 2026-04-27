public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Eletronico notebook = new Eletronico("Notebook Gamer", 4500.00, 12);
        Alimento leite = new Alimento("Leite Integral", 6.50, "15/06/2026");

        // Exibindo as informações
        System.out.println("--- Detalhes do Eletrônico ---");
        notebook.mostrarProduto();

        System.out.println("\n--- Detalhes do Alimento ---");
        leite.mostrarProduto();
    }
}
