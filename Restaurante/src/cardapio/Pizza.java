package cardapio;
import javax.swing.JOptionPane;
class Pizza {
    private String nome;
    private double valor;
    private boolean borda;

    public Pizza(String nome, double valor, boolean borda) {
        this.nome = nome;
        this.valor = valor;
        this.borda = borda;
    }
    public double calcularValor() {
        if (borda) {
            return valor + 5;
        }
        return valor;
    }
    public String getNome(){
        return nome;
    }
}

class hamburguer{
    private String nome;
    private double valor;
    private boolean artesanal;

    public hamburguer(String nome, double valor, boolean artesanal) {
        this.nome = nome;
        this.valor = valor;
        this.artesanal = artesanal;
    }
    public double calcularValor(){
        if (artesanal){
            return valor + 8;
        }
        return valor;
    }
    public String getNome(){
        return nome;
    }

}
class Restaurante {
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 3) {
            String[] opcoes = {"Hamburguer", "Pizza", "Sair"};
            opcao = JOptionPane.showOptionDialog(null, "Informe o pedido:", "Restaurante", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    String nomeHamburguer = JOptionPane.showInputDialog("Digite o nome do hamburguer:");
                    double valorHamburguer = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do hamburguer:"));
                    boolean artesanal = JOptionPane.showConfirmDialog(null, "O hamburguer é artesanal?", "Restaurante", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    hamburguer hamburguer = new hamburguer (nomeHamburguer, valorHamburguer, artesanal);
                    JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: R$" + hamburguer.calcularValor());
                    break;
                case 1:
                    String nomePizza = JOptionPane.showInputDialog("Digite o nome da pizza:");
                    double valorPizza = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza:"));
                    boolean borda = JOptionPane.showConfirmDialog(null, "A pizza possui borda?", "Restaurante", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    Pizza pizza = new Pizza(nomePizza, valorPizza, borda);
                    JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: R$" + pizza.calcularValor());
                    break;
            }
        }
    }
}
