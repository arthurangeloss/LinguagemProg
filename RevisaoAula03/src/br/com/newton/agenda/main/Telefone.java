package br.com.newton.agenda.main;

import java.util.Scanner;

import br.com.newton.agenda.Contato;

public class Telefone {
    public static void main(String[] args) {
        Scanner nomeContato = new Scanner(System.in);
        System.out.println("Digite o nome do contato: ");
        String Contato = nomeContato.nextLine();

        System.out.println("Informe seu número de telefone: ");
        int telefone = nomeContato.nextInt();

        if (telefone <= 8) {
            System.out.println("Infelizmente esse telefone é invalido!");
        }else if (telefone >9){
            System.out.println("Telefone validado com sucesso!!");
        }
    }
}