/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Candidato {
    private String nome;
    private String bi;
    private String historico;
    private String municipio_id;
    private String municipio;
    private List<Voto> votos;
    
    public Candidato(){
        
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    

    public Candidato(String nome, String bi, String historico, String municipio_id) {
        this.nome = nome;
        this.bi = bi;
        this.historico = historico;
        this.municipio_id = municipio_id;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getMunicipio_id() {
        return municipio_id;
    }

    public void setMunicipio_id(String municipio_id) {
        this.municipio_id = municipio_id;
    }

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }
    
    
}
