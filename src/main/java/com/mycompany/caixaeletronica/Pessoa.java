/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixaeletronica;

public class Pessoa {

    /**
     * @return the dinheiro
     */
    public double getDinheiro() {
        return dinheiro;
    }

    /**
     * @param dinheiro the dinheiro to set
     */
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    //variaveis com caracteristicas da classe pessoa   
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private double dinheiro;

    public Pessoa(String nome, String cpf, String endereco, String telefone, String email, double dinheiro) {

        this.nome = nome;
        this.dinheiro = dinheiro;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;

    }

    //get set pegar sao metodos
    // void é um metodo sem retorno
    public String getNome() {
        return nome;
    }
// string nome é um parametro

    public void setNome(String nome) {
        // this = isto/isso
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
