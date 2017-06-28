package br.com.main;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Generate {
	public static void main(String[] args) {
		Integer[] numbers = new Integer[6];
		
		for (int cont = 0; cont < 6; cont++) {
			numbers[cont] = addNumber(numbers);
		}
		Arrays.sort(numbers);
		
		JOptionPane.showMessageDialog(null, "Seguem os números que serão sorteados: "
				+ Arrays.toString(numbers) + ".");
	}
	
	private static Integer addNumber(Integer[] numbers) {
		double n = Math.random() * 60 + 1;
		Integer fN = (int)n;
		for (Integer number : numbers) {
			if (number != null && (int)n == number)
				fN = addNumber(numbers);
		}
		
		return fN;
	}
}
