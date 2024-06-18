package poo_aleatoriamente;

public class Roupa extends Produto {

	String tamanho;
	
	public Roupa (String nome,double preco,String tamanho){
		super(nome,preco);
		this.tamanho = tamanho;
	}
	
	public String toString () {
		return "Nome"+ nome + "Preco " + preco +"Tamnho" + tamanho;
	}
}
