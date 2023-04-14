import java.util.ArrayList;
import java.util.List;
public class Pedido {
    Massa massa;
    Cliente cliente;

    List <Ingrediente> Lista = new ArrayList<Ingrediente>();

    public double calculPedido (){

        return massa.getValor();
    }

}
