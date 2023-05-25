/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import data.ConexaoJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Candidato;
import models.Municipio;

/**
 *
 * @author Marino Ricardo
 */
public class CandidatoController {

    private final Connection con;

    public CandidatoController() {
        con = new ConexaoJDBC().getConnection();
    }

    public void save(Candidato obj) {
        try {

            String sql = "insert into candidato (nome, bi, historico, municipio_id)"
                    + "values(?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getBi());
            stmt.setString(3, obj.getHistorico());
            stmt.setString(4, obj.getMunicipio_id());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar cadastro, erro encontrado: " + e);
        }
    }

    public List<Candidato> listarCandidatos() {
        try {
            List<Candidato> lista = new ArrayList();

            String sql = "SELECT c.nome AS nome, m.descricao AS municipio, c.bi AS bi, c.historico as historico FROM candidato c JOIN municipio m ON c.municipio_id = m.id;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Candidato obj = new Candidato();

                obj.setNome(rs.getString("nome"));
                obj.setMunicipio(rs.getString("municipio"));
                obj.setBi(rs.getString("bi"));
                obj.setHistorico(rs.getString("historico"));
                lista.add(obj);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar cadastro, erro encontrado:" + e);

            return null;
        }
    }

    public List<Candidato> listarCandidatosFromMunicipio(String id) {
        try {
            List<Candidato> lista = new ArrayList();

            String sql = "SELECT * FROM candidato where municipio_id=?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Candidato obj = new Candidato();
                obj.setNome(rs.getString("nome"));
                obj.setBi(rs.getString("bi"));
                obj.setHistorico(rs.getString("historico"));
                lista.add(obj);
            }
            System.out.println("chegueiii" + lista);

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar cadastro, erro encontrado:" + e);

            return null;
        }
    }

    public List<Municipio> listarMunicipios() {
        try {
            List<Municipio> lista = new ArrayList();

            String sql = "SELECT * FROM municipio;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Municipio obj = new Municipio();
                obj.setId(rs.getString("id"));
                obj.setDescricao(rs.getString("descricao"));
                lista.add(obj);
            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel listar cadastro, erro encontrado:" + e);

            return null;
        }
    }

}
