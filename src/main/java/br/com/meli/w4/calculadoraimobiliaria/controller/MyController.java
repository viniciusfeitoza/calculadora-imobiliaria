/*
Desenvolva uma API que receba uma:
Casa com seu "nome", "endereço" e uma lista de "cômodos".
Comodo deve conter os atributos: ”nome", "largura" e "comprimento".

Como requisito funcional é solicitado que a API:
a) Retorne o número total de metros quadrados da casa.
http://localhost:8080/area/nomeDaCasa
b) Retorne o valor da casa tendo em consideração R$ 800 por metro quadrado.
http://localhost:8080/valor/nomeDaCasa
c) Retorne o maior cômodo.
http://localhost:8080/maiorComodo/nomeDaCasa
d) Retorne a quantidade de metros quadrados por cômodo.
http://localhost:8080/areaComodos/nomeDaCasa
*/


package br.com.meli.w4.calculadoraimobiliaria.controller;

import br.com.meli.w4.calculadoraimobiliaria.entity.Casa;
import br.com.meli.w4.calculadoraimobiliaria.entity.Comodo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class MyController {

    @GetMapping("/ping")
    public String meuMetodo(){
        return "pong";
    }

    private static List<Comodo> comodos1=
            Arrays.asList(Comodo.builder()
                    .nome("Sala")
                    .largura(5)
                    .comprimento(3)
                    .build(),
                    Comodo.builder()
                    .nome("Quarto")
                    .largura(5)
                    .comprimento(3)
                    .build()

            );

    private static List<Casa> casas =
            Arrays.asList(Casa.builder()
                    .nome("Vinicius")
                    .endereco("Rua Amarais 101")
                    .listaComodos(comodos1)
                    .build()
            );
}