package problema_dois;

import java.util.Scanner;

public class LetterAChecker {
    public static void main(String[] args) {

        //2) Escreva um programa que verifique, em uma string,
        // a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para verificar a existência da letra 'a': ");
        String input = scanner.nextLine();
        scanner.close();

        int count = countLetterA(input);
        if (count > 0) {
            System.out.println("A letra 'a' apareceu " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não apareceu na string.");
        }
    }

    public static int countLetterA(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}

