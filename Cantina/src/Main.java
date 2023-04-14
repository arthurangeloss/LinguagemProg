import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        String nome,massa;
        double valor;

        nome = JOptionPane.showInputDialog("Informe o nome do Cliente: ");
        p.cliente.setNome(nome);
        massa = JOptionPane.showInputDialog("Informe o nome da massa: ");
        p.massa.setTipo(massa);
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Massa: "));
        p.massa.setValor(valor);

        String opcao;
        int finalizar=0;

    }
}
