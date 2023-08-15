package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
	static String st(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int in(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double dou(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	static double ValorTotal(Produto[] p, int i) {
		double total =0;
		for (int c = 0 ; c < i ; c ++) {
			total += p[c].getValor() * p[c].getQuantidade();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
	Produto[] vetorProduto = new Produto[5];
	
	int indice = 0;
	
	do {
		vetorProduto[indice] = new Produto();
		vetorProduto[indice].setTipo(st("Tipo"));
		vetorProduto[indice].setMarca(st("Marca"));
		vetorProduto[indice].setQuantidade(in("Quantidade"));
		vetorProduto[indice].setValor(dou("Valor"));
		
		indice ++;
		
	}while(JOptionPane.showConfirmDialog(null, "Adicionar Produto?", "Carrinho de Compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
	
	for (int contador = 0; contador < indice; contador ++) {
		System.out.println("tipo: " + vetorProduto[contador].getTipo() +
				"\nMarca: " + vetorProduto[contador].getTipo() + 
				"\nQuantidade" + vetorProduto[contador].getQuantidade() +
				"\nValor" + vetorProduto[contador].getValor());
	}

	System.out.println("\nValor Total" + ValorTotal(vetorProduto, indice));

	}

}

//jkdnklgvnfklnvf