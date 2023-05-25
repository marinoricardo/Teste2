
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;


/**
 *

*/
public class TestarConexao {
    public  static void main(String[] args){
        try {
            new ConexaoJDBC().getConnection();
            JOptionPane.showMessageDialog(null, "conexao bem sucedida" );
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ops conexão não realiada" + e);
        }
       
}}