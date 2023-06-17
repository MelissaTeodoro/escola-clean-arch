package br.com.alura.aluno;

public interface CifradorDeSenha {

    String cifrarSenha(String senha);
    boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta);
}
