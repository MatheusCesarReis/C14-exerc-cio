package org.example;
import org.apache.commons.lang3.StringUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "   Matheus   ";
        String nome1 = " Tiago ";

        // Remove espaços do início e do fim
        System.out.println(StringUtils.trim(nome)); // "Matheus"

        // Verifica se está vazio ou só com espaços
        System.out.println(StringUtils.isBlank("   ")); // true

        // Converte para maiúsculas
        System.out.println(StringUtils.upperCase(nome1)); // " TIAGO "

// Converte para minúsculas
        System.out.println(StringUtils.lowerCase(nome1)); // " tiago "

// Remove todos os espaços internos
        System.out.println(StringUtils.deleteWhitespace(nome1)); // "Tiago"

// Verifica se string é numérica
        System.out.println(StringUtils.isNumeric("12345")); // true
        System.out.println(StringUtils.isNumeric("Tiago")); // false

    }
}
