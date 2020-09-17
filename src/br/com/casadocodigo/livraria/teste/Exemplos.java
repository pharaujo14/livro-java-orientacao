package br.com.casadocodigo.livraria.teste;

public class Exemplos {
	public static void main(String[] args) {
		long round = Math.round(3.99);
		long max = Math.max(100, 10);
		int min = Math.min(100, 10);
		int abs = Math.abs(-5);
		double sqrt = Math.sqrt(4);
		
		System.out.println("round: " + round);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("abs: " + abs);
		System.out.println("sqrt: " + sqrt + "\n");
		
		String java = "java";
		
		String replace = java.replace("v", "c");
		String upperCase = java.toUpperCase();
		String lowerCase = "JAVA".toLowerCase();
		char charAt = java.charAt(0);
		boolean endsWith = java.endsWith("a");
		boolean startsWith = java.startsWith("s");
		boolean equals = java.equalsIgnoreCase("JAVA");
		
		System.out.println("replace: " + replace);
		System.out.println("upperCase: " + upperCase);
		System.out.println("lowerCase: " + lowerCase);
		System.out.println("charAt 0: " + charAt);
		System.out.println("endsWith A: " + endsWith);
		System.out.println("startsWith S: " + startsWith);
		System.out.println("equals JAVA: " + equals);
		
		
		
		
	}

}
