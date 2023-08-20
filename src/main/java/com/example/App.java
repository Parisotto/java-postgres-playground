package com.example;

import java.sql.SQLException;
import com.example.dao.ConnectionManager;
//import com.example.dao.DAO;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;
import com.example.model.Marca;
import com.example.model.Produto;

public class App {
    public static void main(String[] args) {
        new App();
    }

    public App(){
        try(var conn = ConnectionManager.getConnection()){
            var estadoDAO = new EstadoDAO(conn);
            estadoDAO.localizar("SP");

            var listaEstados = estadoDAO.listar();
            for (var estado : listaEstados) {
                System.out.println(estado);
            }
            
            var marca = new Marca();
            marca.setId(1L);

            var produto = new Produto();
            produto.setMarca(marca);
            produto.setNome("Teste");
            produto.setValor(100L);

            var produtoDAO = new ProdutoDAO(conn);
            produtoDAO.inserir(produto);
            produtoDAO.excluir(201L);

            //var dao = new DAO(conn);
            //dao.listar("produto");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }        
    }
}
