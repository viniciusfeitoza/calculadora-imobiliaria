package br.com.meli.w4.calculadoraimobiliaria.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Comodo {
    private String nome;
    private int largura;
    private int comprimento;
}
