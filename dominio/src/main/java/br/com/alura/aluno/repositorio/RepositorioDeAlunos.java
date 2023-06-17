package br.com.alura.aluno.repositorio;

import br.com.alura.aluno.Aluno;
import br.com.alura.aluno.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCpf(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();

}
