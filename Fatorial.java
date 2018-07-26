public class Fatorial {
	
	// versao iterativa do calculo do fatorial, incluindo teste n == 0
	public int calcularFatorial(int n) throws IllegalArgumentException {
		int resultado = 1;
		
		if (n < 0)
			throw new IllegalArgumentException("Excecao gerada");
		
		if(n !=0)
			for (int i = 2; i <= n; i++)
				resultado *= i;
		
		return resultado;
	}
}