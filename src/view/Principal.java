package view;

import javax.swing.JOptionPane;

import controller.ApartamentoControle;
import model.Morador;

public class Principal {

	public static void main(String[] args) {
		ApartamentoControle a = new ApartamentoControle();
		
		try {
			Morador mor = new Morador(101, "Carlos", "Astra", "Preto", "HZZ1503");
			a.add(mor);
			mor = new Morador(102, "Paula", "Onix", "Cinza", "JIC8124");
			a.add(mor);
			mor = new Morador(301, "Antônio", "Fusca", "Azul", "MPR2541");
			a.add(mor);
			mor = new Morador(402, "Fernando", "HB20", "Branco", "NAC5063");
			a.add(mor);
			mor = new Morador(801, "Beatriz", "Corolla", "Preto", "KMB8327");
			a.add(mor);
			mor = new Morador(1001, "Arlete", "Cronos", "Vermelho", "MOM8537");
			a.add(mor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int x = 0;
		while (x != 9) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Adicionar morador\n2 - Remover morador\n3 - Consultar morador\n4 - Consultar andar\n9 - Fim"));
			switch(x) {
			case 1:
				int apt = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do apartamento: "));
				String nome = JOptionPane.showInputDialog("Insira o nome do morador: ");
				String modelo = JOptionPane.showInputDialog("Insira o modelo do carro: ");
				String cor = JOptionPane.showInputDialog("Insira a cor do carro: ");
				String placa = JOptionPane.showInputDialog("Insira a placa do carro: ");
				Morador mor = new Morador(apt, nome, modelo, cor, placa);
				try {
					a.add(mor);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				int aptR = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do apartamento a ser removido: "));
				Morador morR = new Morador(aptR);
				try {
					a.remove(morR);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				int aptS = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do apartamento a ser pesquisado: "));
				Morador morS = new Morador(aptS);
				try {
					a.search(morS);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				int andar = Integer.parseInt(JOptionPane.showInputDialog("Insira o andar: "));
				try {
					a.listAndar(andar);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Inválido");
				break;
			}
		}
		
	}

}
