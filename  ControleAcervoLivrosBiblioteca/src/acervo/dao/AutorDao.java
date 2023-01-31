/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acervo.dao;

import acervo.bean.Autor;
import acervo.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class AutorDao {

    public static void inserir(Autor autor) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "insert into autor (autor_nome) "
                + "values (?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, autor.getAutor_nome());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public static void editar(Autor autor) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "update autor "
                + "set autor_nome = ? "
                + "where autor_id = ?;";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, autor.getAutor_nome());;
        stmt.setInt(2, autor.getAutor_id());
        stmt.executeUpdate();
        stmt.close();
        con.close();
    }

    public static void esxluir(Autor autor) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "delete from autor "
                + "where autor_id = ?;";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, autor.getAutor_id());
        stmt.executeUpdate();
        stmt.close();
        con.close();
    }

    public static List<Autor> pesquisar(Autor autorPesq) throws SQLException {
        List<Autor> autores = new ArrayList<>();
        Connection con = Conexao.getConexao();
        String sql = "select * from autor "
                + "where autor_nome "
                + "like '%" + autorPesq.getAutor_nome() + "%' order by autor_nome";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Autor autor = new Autor();
            autor.setAutor_id(rs.getInt("autor_id"));
            autor.setAutor_nome(rs.getString("autor_nome"));
            autores.add(autor);
        }
        stmt.close();
        rs.close();
        con.close();
        return autores;
    }

    public static List<Autor> listar() throws SQLException {
        List<Autor> autores = new ArrayList<>();
        Connection con = Conexao.getConexao();
        String sql = "select * from autor "
                + "order by autor_nome";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Autor autor = new Autor();
            autor.setAutor_id(rs.getInt("autor_id"));
            autor.setAutor_nome(rs.getString("autor_nome"));
            autores.add(autor);
        }
        stmt.close();
        rs.close();
        con.close();
        return autores
                ;
    }
}
