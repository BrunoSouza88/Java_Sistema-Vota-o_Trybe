package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * PessoaCandidata.
   */

  public PessoaEleitora(String nome, String cpf) {
    super();

    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
