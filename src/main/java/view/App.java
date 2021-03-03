package view;

import java.util.Locale;
import java.util.Random;

import controller.ThreadVetor;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		ThreadVetor th = new ThreadVetor();
		Random random = new Random();
		
		int valorNumerico = 4;
		int vetor = 3;
		
		if(valorNumerico % 2 == 0) {
			th.tempoThreadFor(valorNumerico, vetor);
		}
		else {
			th.tempoThreadForeach(valorNumerico, vetor);
		}
	
		
		int vetor2[] = new int[1000];
		for(int i = 1; i <= vetor2.length; i++) {
			
			int aleatorio = random.nextInt(100);
			
			th.tempoThreadFor(1, vetor);
			th.tempoThreadForeach(2, vetor);
		}
	}

}
