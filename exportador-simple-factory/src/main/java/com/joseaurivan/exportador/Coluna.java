/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseaurivan.exportador;


public interface Coluna {
    String getTitulo();
    void setTitulo(String titulo);
    String abrir();
    String fechar();
    String exportarCabecalho();
    String exportarDado(Produto produto);
    
}
