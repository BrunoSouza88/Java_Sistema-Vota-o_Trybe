package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {

  int numero;
  int votos;

  /**
   * PessoaCandidata.
   */

  public PessoaCandidata(String nome, int numero) {
    super();

    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return this.votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
