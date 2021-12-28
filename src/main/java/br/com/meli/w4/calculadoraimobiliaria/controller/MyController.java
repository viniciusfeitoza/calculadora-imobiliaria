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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/ping")
    public String meuMetodo(){
        return "pong";
    }
}

