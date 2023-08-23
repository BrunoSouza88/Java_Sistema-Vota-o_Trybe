package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para gerenciar o sistema de votação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private List<PessoaCandidata> pessoasCandidatas;
  private List<PessoaEleitora> pessoasEleitoras;
  private List<String> cpfsComputados;

  /**
   * Super.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
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

  /**
   * Metodo para votar.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    PessoaEleitora eleitor = null;
    for (PessoaEleitora e : pessoasEleitoras) {
      if (e.getCpf().equals(cpfPessoaEleitora)) {
        eleitor = e;
        break;
      }
    }
    if (eleitor == null) {
      System.out.println("Pessoa eleitora não cadastrada!");
      return;
    }

    PessoaCandidata candidata = null;
    for (PessoaCandidata c : pessoasCandidatas) {
      if (c.getNumero() == numeroPessoaCandidata) {
        candidata = c;
        break;
      }
    }
    if (candidata == null) {
      System.out.println("Pessoa candidata não cadastrada!");
      return;
    }

    cpfsComputados.add(cpfPessoaEleitora);
    candidata.receberVoto();
    ;
  }

  /**
   * Metodo para mostrar resultado.
   */
  public void mostrarResultado() {
    for (PessoaCandidata candidata : pessoasCandidatas) {
      System.out.println(candidata.getNome() + ": " + candidata.getVotos() + " votos");
    }
  }
}
