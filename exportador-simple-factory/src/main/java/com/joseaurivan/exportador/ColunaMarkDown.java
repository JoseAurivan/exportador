/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseaurivan.exportador;

import java.util.function.Function;

/**
 *
 * @author auriv
 */
class ColunaMarkDown extends AbsColuna {

    public ColunaMarkDown(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "|";
    }

    @Override
    public String fechar() {
        return "";
    }
    
}
