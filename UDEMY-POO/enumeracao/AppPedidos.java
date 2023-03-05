package enumeracao;
import java.util.Date;

public class AppPedidos {

	public static void main(String[] args) {

		Pedidos pedidos = new Pedidos(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedidos);
		
		StatusPedido sp1 = StatusPedido.ENTREGUE;
		StatusPedido sp2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(sp1);
		System.out.println(sp2);
		
	}

}
