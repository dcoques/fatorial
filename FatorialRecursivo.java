public class FatorialRecursivo {
	
	// versao recursiva do calculo do fatorial, incluindo teste n == 0
	public static int calcularFatorialRecursivo(int n) throws IllegalArgumentException {
		
		if (n == 0)
			return 1;
		
		return n * calcularFatorialRecursivo(n - 1);
	}
	
	public static void main(String[] args) {
	
		System.out.println(calcularFatorialRecursivo(5));
	
	}
	
}