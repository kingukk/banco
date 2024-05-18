/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixaeletronica;

import javax.swing.JOptionPane;

public class Conta {

    String nome;
    String cpf;
    String endereco;
    String telefone;
    String email;
    double dinheiro;

    //criar objeto pessoa
    Pessoa pessoa = new Pessoa(nome, cpf, endereco, telefone, email, dinheiro);

    public void sacar(double valorSaque) {
        double saque = pessoa.getDinheiro() - valorSaque;
        pessoa.setDinheiro(saque);
        System.out.println(pessoa.getDinheiro());
    }

    public void deposito(double valorDeposito) {
        double deposito = pessoa.getDinheiro() + valorDeposito;
        pessoa.setDinheiro(deposito);
        System.out.println(pessoa.getDinheiro());
    }

    public void extrato() {
        JOptionPane.showMessageDialog(null, pessoa.getDinheiro());

    }

    public void criarConta() {
        nome = JOptionPane.showInputDialog(null, "Digite um nome ");
        cpf = JOptionPane.showInputDialog(null, "Digite seu CPF ");
        endereco = JOptionPane.showInputDialog(null, "Digite seu endereço ");
        telefone = JOptionPane.showInputDialog(null, "Digite seu telefone ");
        email = JOptionPane.showInputDialog(null, "Digite seu email ");
        dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu dinheiro "));

        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);
        pessoa.setEmail(email);
        pessoa.setDinheiro(dinheiro);

        System.out.println("\n" + pessoa.getNome() + "\n" + pessoa.getCpf() + "\n" + pessoa.getEndereco() + "\n" + pessoa.getTelefone() + "\n" + pessoa.getEmail() + "\n" + pessoa.getDinheiro());
    }

}
