package poo_aleatoriamente;

public class Eletronico extends Produto{
	public Eletronico(String nome, double preco,String marca) {
		super(nome, preco);
		this.marca = marca;
	}

	String marca;
	
	@Override
	public String toString() {
		return "nome" + nome +" preco" + preco +" marca" + marca;
	}
}
