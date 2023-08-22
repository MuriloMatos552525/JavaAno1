package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorWhile {
	
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
		
		Produto[] vetorProduto = new Produto[3];
		
		int indice =0;
		
		int continuar =0;
		
		while(continuar == 0) {
			vetorProduto[indice] = new Produto();
			
			vetorProduto[indice].setTipo(st("tipo"));
			vetorProduto[indice].setMarca(st("Marca"));
			vetorProduto[indice].setQuantidade(in("quantidade"));
			vetorProduto[indice].setValor(dou("valor"));
			
			indice ++;
			
	continuar = JOptionPane.showConfirmDialog(null, "adicionar produto?", "Carrinho de compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	
		}
		
		for (int contador = 0; contador < indice; contador ++) {
			System.out.println("tipo: " + vetorProduto[contador].getTipo() +
					"\nMarca: " + vetorProduto[contador].getTipo() + 
					"\nQuantidade" + vetorProduto[contador].getQuantidade() +
					"\nValor" + vetorProduto[contador].getValor());
		}
		
		System.out.println("\nValor Total" + ValorTotal(vetorProduto, indice));

		
	}

}
