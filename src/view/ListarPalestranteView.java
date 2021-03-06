package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarPalestranteView {

    public void telaListar(ResultSet rs){
        try{
            String leftAlignFormat = "| %-4d | %-16s | %-27s | %-12s | %-11d |%n";

            System.out.println("                                      TABELA DE PALESTRANTES");
            System.out.format("+------+------------------+-----------------------------+--------------+-------------+%n");
            System.out.format("|  ID  |       Nome       |            Email            |   Telefone   | FK_Endereço |%n");
            System.out.format("+------+------------------+-----------------------------+--------------+-------------+%n");

            while(rs.next()){
                Integer id = rs.getInt("idpalestrante");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                Integer endereco = rs.getInt("endereco_idendereco");

                System.out.format(leftAlignFormat, id, nome, email, telefone, endereco);
            }

            System.out.format("+------+------------------+-----------------------------+-------------+--------------+%n");
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }
}
