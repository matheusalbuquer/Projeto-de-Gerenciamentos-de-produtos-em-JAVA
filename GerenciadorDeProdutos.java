package poo_aleatoriamente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GerenciadorDeProdutos  {
	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Produto> produtos = new ArrayList<>();

	       
	        System.out.println("Cadastro de Produtos:");
	        while (true) {
	            System.out.println("Selecione o tipo de produto (1 - Eletrônico, 2 - Roupa, 3 - Alimento, 0 - Sair):");
	            int tipo = scanner.nextInt();
	            scanner.nextLine();

	            if (tipo == 0) {
	                break;
	            }

	            System.out.println("Nome do produto:");
	            String nome = scanner.nextLine();

	            System.out.println("Preço do produto:");
	            double preco = scanner.nextDouble();
	            scanner.nextLine();

	            switch (tipo) {
	                case 1:
	                    System.out.println("Marca do produto:");
	                    String marca = scanner.nextLine();
	                    produtos.add(new Eletronico(nome, preco, marca));
	                    break;
	                case 2:
	                    System.out.println("Tamanho do produto:");
	                    String tamanho = scanner.nextLine();
	                    produtos.add(new Roupa(nome, preco, tamanho));
	                    break;
	                case 3:
	                    System.out.println("Data de validade do produto:");
	                    String dataValidade = scanner.nextLine();
	                    produtos.add(new Alimento(nome, preco, dataValidade));
	                    break;
	                default:
	                    System.out.println("Tipo de produto inválido.");
	            }
	        }

	        if (!produtos.isEmpty()) {
	            Produto menorPreco = Collections.min(produtos, (p1, p2) -> Double.compare(p1.preco, p2.preco));
	            System.out.println("\nProduto com menor preço:");
	            System.out.println(menorPreco);

	            int quantidadeMesmoTipo = 0;
	            for (Produto produto : produtos) {
	                if (produto.getClass() == menorPreco.getClass()) {
	                    quantidadeMesmoTipo++;
	                }
	            }
	            System.out.println("Quantidade de produtos do mesmo tipo que o produto com menor preço: " + quantidadeMesmoTipo);
	        } else {
	            System.out.println("\nNenhum produto cadastrado.");
	        }

	        scanner.close();
	    }
		
		
	}

