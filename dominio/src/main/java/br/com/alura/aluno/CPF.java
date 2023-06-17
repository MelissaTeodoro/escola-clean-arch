package br.com.alura.aluno;

public class CPF {

    private String value;

    public CPF(String value) {
        if (value == null || !value.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
            throw new IllegalArgumentException("CPF invalido!");

        this.value = value;
    }
}
