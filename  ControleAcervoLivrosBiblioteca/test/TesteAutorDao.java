
import acervo.bean.Autor;
import acervo.dao.AutorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author maico
 */
public class TesteAutorDao {

    private static void inserirTeste() {
        try {
            Autor a = new Autor("Teste Abacaxi");
            AutorDao.inserir(a);
            System.out.println("Registro feito com sucesso.");
        } catch (SQLException ex) {
            System.out.println("Nao foi possivel realizar o registro");
            ex.printStackTrace();
        }
    }

    private static void editarTeste() {
        try {
            Autor a = new Autor(1, "Abacaxi");
            AutorDao.editar(a);
            System.out.println("Registro editado com sucesso.");
        } catch (SQLException ex) {
            System.out.println("Nao foi possivel editar o registro");
            ex.printStackTrace();
        }
    }

    private static void excluirTeste() {
        Autor a = new Autor();
        a.setAutor_id(1);
        try {
            AutorDao.esxluir(a);
            System.out.println("Registro excluido com sucesso.");
        } catch (SQLException ex) {
            System.out.println("Nao foi possivel excluir o registro");
            ex.printStackTrace();
        }
    }

    private static void listarTeste() {
        try {
            List<Autor> a = AutorDao.listar();
            System.out.println(a.toString());
        } catch (SQLException ex) {
            Logger.getLogger(TesteAutorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void pesquisarTeste() {
        List<Autor> autores = new ArrayList<>();
        Autor a = new Autor("Aba");
        try {
            autores = AutorDao.pesquisar(a);
            System.out.println("Pesquisa feita com sucesso.");
        } catch (SQLException ex) {
            System.out.println("No foi possivel realizar a pesquisa");
            ex.printStackTrace();
        }
        System.out.println(autores.toString());
    }

    public static void main(String[] args) {
        //inserirTeste();
        //editarTeste();
        //pesquisarTeste();    
        //excluirTeste();
        //listarTeste();
    }
}
