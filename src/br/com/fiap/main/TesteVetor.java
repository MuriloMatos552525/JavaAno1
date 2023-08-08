package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
	static String tx(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int in(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
				
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {

		Produto[] vetorProduto = new Produto[2];
		
		int indice = 0;
		
		do {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(tx("tipo de produto"));
			vetorProduto[indice].setMarca(tx("Marca do produto"));
			vetorProduto[indice].setQuantidade(in("quantidade"));
			vetorProduto[indice].setValor(real("valor"));

			indice ++;

		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de compras", JOptionPane.YES_NO_OPTION)==1);
		
		for(int contador =0; contador < indice; contador ++) {
			System.out.println("tipo: " + vetorProduto[contador].getTipo() + 
			"\nMarca: " + vetorProduto[contador].getMarca() + 
			"\nQuantidade: " + vetorProduto[contador]. getQuantidade() + 
			"\nValor: " + vetorProduto[contador].getValor());
		}

	}

}
