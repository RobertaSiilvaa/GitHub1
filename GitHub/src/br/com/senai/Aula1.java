package br.com.senai;

import javax.swing.JOptionPane;

public class Aula1 {
	
	static String msg = "Bem vindo ao GitHub ";
	static String meuNome = "SENAI";

	public static void main(String[] args) {		
		JOptionPane.showMessageDialog(null,msg);
	}
	
	static void trocaMsg(){
		msg = JOptionPane.showInputDialog("Entre com uma nova mensagem ");
	}
	
	static void qualSeuNome(){
		JOptionPane.showMessageDialog(null,meuNome);
	}

}
