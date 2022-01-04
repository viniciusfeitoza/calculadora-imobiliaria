package br.com.meli.w4.calculadoraimobiliaria.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Casa extends Comodo{
    private String nome;
    private String endereco;
    private List<Comodo> listaComodos;
}
