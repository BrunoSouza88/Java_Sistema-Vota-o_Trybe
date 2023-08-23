package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para gerenciar o sistema de votação.
 */
public class GerenciamentoVotacao {

  private List<PessoaCandidata> pessoasCandidatas;
  private List<PessoaEleitora> pessoasEleitoras;

  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
  }

  /**
   * Cadastra uma pessoa candidata.
   */

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidata : pessoasCandidatas) {
      if (candidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }

    PessoaCandidata novacCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(novacCandidata);
  }

  /**
   * Metodo cadastro pessoa eleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitor : pessoasEleitoras) {
      if (eleitor.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }

    PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(novoEleitor);
  }
}
