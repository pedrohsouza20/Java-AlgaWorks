package pedido;

public class Index {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.codigo = "1234";
		pedido.desconto = 7.3f;
		pedido.subTotal = 8.9f;
		
		System.out.println("Código: " + pedido.getCodigo());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Sub total: " + pedido.getSubTotal());
		System.out.println("Total: " + pedido.getTotal());
		
	}

}
