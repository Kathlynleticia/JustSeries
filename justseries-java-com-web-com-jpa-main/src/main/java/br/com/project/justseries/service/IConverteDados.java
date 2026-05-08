package br.com.project.justseries.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
