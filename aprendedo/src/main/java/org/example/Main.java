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
        }
}