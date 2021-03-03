package controller;

public class ThreadVetor {
	
	public ThreadVetor() {}
	
	int cont;
	
	public void tempoThreadFor(int valorNumerico, int vetor) {
		int vet[] = new int[vetor];
		double tempoInicial = System.nanoTime();
		for(int i = 1; i <= vet.length; i++) {
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo: " + tempoTotal + " seg");
	}
		
	public void tempoThreadForeach(int valorNumerico, int vetor) {
		int vet[] = new int[vetor];
		double tempoInicial = System.nanoTime();
		for (int j : vet) {	
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo: " + tempoTotal + " seg");	
	}

}
