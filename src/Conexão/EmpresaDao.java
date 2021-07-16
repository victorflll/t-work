package Conexão;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Classes.Empresa;

public class EmpresaDao {

    private String login;
    private String senha;
    
    public void salvar(Empresa em){
        String sql = "INSERT INTO EMPRESA VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, em.getLogin());
            pst.setString(2, em.getSenha());
            pst.setString(3, em.getNome());
            pst.setString(4, em.getDataAbertura());
            pst.setString(5, em.getEndereço());
            pst.setString(6, em.getCnpj());
            pst.setString(7, em.getTelefone());
            pst.setString(8, em.getDescrição());
            pst.setString(9, em.getNecessidade());
            pst.setInt(10, em.getVagas());
            pst.execute();

            pst.close();
            conn.close();

            System.out.println("Empresa salva com sucesso...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Empresa consultar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        
        String sql = "SELECT * FROM EMPRESA WHERE LOGIN=? AND SENHA=?";
        Empresa em = null;

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
                String dtA = rs.getString("DATAABERTURA");
                String ende = rs.getString("ENDEREÇO");
                String cnpj = rs.getString("CNPJ");
                String telefone = rs.getString("TELEFONE");
                String desc = rs.getString("DESCRIÇÃO");
                String nece = rs.getString("NECESSIDADE");
                int vagas = rs.getInt("VAGAS");
                

                em = new Empresa(usu, pass, nome, dtA, ende, cnpj, telefone, desc, nece, vagas);
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return em;
    }
    
    public void atualizar(Empresa em){
        String sql = "UPDATE EMPRESA SET ENDEREÇO=?, TELEFONE=?, DESCRIÇÃO=?, NECESSIDADE=?, VAGAS=? WHERE LOGIN=? AND SENHA=?";
        
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, em.getEndereço());
            pst.setString(2, em.getTelefone());
            pst.setString(3, em.getDescrição());
            pst.setString(4, em.getNecessidade());
            pst.setInt(5, em.getVagas());
            pst.setString(6, em.getLogin());
            pst.setString(7, em.getSenha());
            pst.execute();
            
            pst.close();
            conn.close();

            System.out.println("Empresa atualizada com sucesso...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
