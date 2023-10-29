package controller;

import model.Lista;
import model.Morador;

@SuppressWarnings("unchecked")
public class ApartamentoControle {
	
	
	Lista<Morador> [] apt = new Lista[10];

	public ApartamentoControle() {
		int tamanho = apt.length;
		for (int i = 0; i<tamanho;i++) {
			apt[i] = new Lista<Morador>();
		}
	}

	/*private int hashCode(int apartamento) {
		int hash = (apartamento /100)-1;
		return hash;
	}*/
	
	public void add(Morador morador) throws Exception {
		int hash = morador.hashCode();
		Lista<Morador> l = apt[hash];
		l.addLast(morador);
	}
	
	public void remove(Morador morador) throws Exception {
		int hash = morador.hashCode();
		Lista<Morador> l = apt[hash];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				Morador m = l.get(i);

				if (morador.apartamento == m.apartamento) {
					l.remove(i);
					break;
				}
			}
		}
	}
	
	public void search(Morador morador) throws Exception {
		int hash = morador.hashCode();
		Lista<Morador> l = apt[hash];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				Morador m = l.get(i);

				if (morador.apartamento == m.apartamento) {
					System.out.println(m);
					break;
				}
			}
		}
	}
	
	public void listAndar(int andar) throws Exception {
		andar = andar - 1;
		Lista<Morador> l = apt[andar];
		if (!l.isEmpty()) {
			int tamanho = l.size();
			for (int i = 0; i < tamanho; i++) {
				System.out.print(l.get(i));
			}
		}
		System.out.println("NULL");
	}
}
