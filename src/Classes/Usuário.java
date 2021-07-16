
package Classes;

public abstract class Usuário {
    String login;
    private String senha;
    
    protected String nome;
    protected String endereço;
    protected String telefone;
    protected String descrição;
    
    public Usuário(){
        
    }
    
    public Usuário(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public Usuário(String nome, String endereço, String telefone, String descrição) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.descrição = descrição;
    }

    public Usuário(String login, String senha, String nome, String endereço, String telefone, String descrição) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.descrição = descrição;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    
}
