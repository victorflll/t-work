
package Conexão;

import Classes.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Classes.Trabalhador;
import javax.swing.JOptionPane;

public class TrabalhadorDao {
    
    String login;
    String senha;
    String nome;            
    String dtN;
    String ende;
    String CPF;
    String telefone;
    String desc;
    String espec;
    
    public void salvar(Trabalhador i){
        String sql = "INSERT INTO TRABALHADOR VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, i.getLogin());
            pst.setString(2, i.getSenha());
            pst.setString(3, i.getNome());
            pst.setString(4, i.getDataNascimento());
            pst.setString(5, i.getEndereço());
            pst.setString(6, i.getCpf());
            pst.setString(7, i.getTelefone());
            pst.setString(8, i.getDescrição());
            pst.setString(9, i.getEspecialidades());
            pst.execute();

            pst.close();
            conn.close();

            System.out.println("Pessoa salva com sucesso...");
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Trabalhador consultar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        
        String sql = "SELECT * FROM TRABALHADOR WHERE LOGIN=? AND SENHA=?";
        Trabalhador trab = null;

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, login);
            pst.setString(2, senha);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String usu = rs.getString("LOGIN");
                String pass = rs.getString("SENHA");
                String nome = rs.getString("NOME");
                String dtA = rs.getString("DATANASCIMENTO");
                String ende = rs.getString("ENDEREÇO");
                String cpf = rs.getString("CPF");
                String telefone = rs.getString("TELEFONE");
                String desc = rs.getString("DESCRIÇÃO");
                String nece = rs.getString("ESPECIALIDADES");

                trab = new Trabalhador(usu, pass, nome, dtA, ende, cpf, telefone, desc, nece);
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return trab;
    }
    
    public void atualizar(Trabalhador t){
        String sql = "UPDATE TRABALHADOR SET ENDEREÇO=?, TELEFONE=?, DESCRIÇÃO=?, ESPECIALIDADES=? WHERE LOGIN=? AND SENHA=?";
        
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, t.getEndereço());
            pst.setString(2, t.getTelefone());
            pst.setString(3, t.getDescrição());
            pst.setString(4, t.getEspecialidades());
            pst.setString(5, t.getLogin());
            pst.setString(6, t.getSenha());
            pst.execute();
            
            pst.close();
            conn.close();

            System.out.println("Pessoa atualizada com sucesso...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getDtN() {
        return dtN;
    }

    public String getEnde() {
        return ende;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDesc() {
        return desc;
    }

    public String getEspec() {
        return espec;
    }
    
    
    
}
