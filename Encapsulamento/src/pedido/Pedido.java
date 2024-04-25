package pedido;

public class Pedido {
	String codigo;
	Float subTotal;
	Float desconto;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}
	public Float getDesconto() {
		return desconto;
	}
	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}
	public Float getTotal() {
		return subTotal - desconto;
	}
	public void setTotal(Float total) {
		
	}
}
