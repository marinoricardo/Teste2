/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author Marino Ricardo
 */
public class Voto {
    private boolean isBranco;
    private boolean isValido;
    private LocalDate dataVoto;

    public Voto(boolean isBranco, boolean isValido, LocalDate dataVoto) {
        this.isBranco = isBranco;
        this.isValido = isValido;
        this.dataVoto = dataVoto;
    }

    public boolean isBranco() {
        return isBranco;
    }

    public boolean isValido() {
        return isValido;
    }

    public LocalDate getDataVoto() {
        return dataVoto;
    }
}
