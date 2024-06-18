package poo_aleatoriamente;

public abstract class Produto implements ObjComparavel{

 String nome;
 double preco;
	

 
	public Produto(String nome, double preco) {
	super();
	this.nome = nome;
	this.preco = preco;
}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
	
	public int comparar(Produto outro) {
		return Double.compare(preco, outro.preco);
	}
}
