package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarUsuarioView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-16s | %-27s | %-11s | %-12s | %-11d |%n";

            System.out.println("                                         TABELA DE USUÁRIOS");
            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");
            System.out.format("|  ID  |       Nome       |            Email            |    Senha    |   Telefone   | FK_Endereço |%n");
            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idusuario");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                String telefone = rs.getString("telefone");
                Integer endereco = rs.getInt("endereco_idendereco");

                System.out.format(leftAlignFormat, id, nome, email, senha, telefone, endereco);
            }

            System.out.format("+------+------------------+-----------------------------+-------------+--------------+-------------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }

}