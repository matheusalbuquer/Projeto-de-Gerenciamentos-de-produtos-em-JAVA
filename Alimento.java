package poo_aleatoriamente;

public class Alimento extends Produto {

 String dataDeValidade;
		
 public Alimento(String nome, double preco, String dataDeValidade) {	
	super(nome,preco);
	this.dataDeValidade = dataDeValidade;
 }
 public String toString() {
	 return  "nome" + nome +" preco" + preco +" Data de validade" + dataDeValidade;
 }

}
