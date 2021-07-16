
package Classes;

public class Empresa extends Usuário{
    private String dataAbertura;
    private String cnpj;
    private String necessidade;
    private int vagas;
    
    public Empresa(){
        
    }

    public Empresa(String login, String senha, String nome, String dataAbertura, String endereço, String cnpj, String telefone, String descrição, String necessidade, int vagas) {
        super(login, senha, nome, endereço, telefone, descrição);
        this.dataAbertura = dataAbertura;
        this.cnpj = cnpj;
        this.necessidade = necessidade;
        this.vagas = vagas;
    }
    public Empresa(String nome, String dataAbertura, String endereço, String cnpj, String telefone, String descrição, String necessidade, int vagas) {
        super(nome, endereço, telefone, descrição);
        this.dataAbertura = dataAbertura;
        this.cnpj = cnpj;
        this.necessidade = necessidade;
        this.vagas = vagas;
    }

    


    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(String necessidade) {
        this.necessidade = necessidade;
    }
    
    public int getVagas(){
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
    
}
