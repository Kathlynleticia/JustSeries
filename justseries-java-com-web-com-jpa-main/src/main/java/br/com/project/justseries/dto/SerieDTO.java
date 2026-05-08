package br.com.project.justseries.dto;

import br.com.project.justseries.model.Categoria;

public record SerieDTO(Long id, String titulo, Integer totalTemporadas, Double avaliacao, Categoria genero, String atores, String poster, String sinopse) {
}
