
package Classes;

public class Trabalhador extends Usuário{
    private String dataNascimento;
    private String cpf;
    private String especialidades;

    public Trabalhador(String login, String senha, String nome, String dataNascimento, String endereço, String cpf, String telefone, String descrição, String especialidades) {
        super(login, senha, nome, endereço, telefone, descrição);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.especialidades = especialidades;
    }
    public Trabalhador(String nome, String dataNascimento, String endereço, String cpf, String telefone, String descrição, String especialidades) {
        super(nome, endereço, telefone, descrição);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.especialidades = especialidades;
    }

    public Trabalhador() {
        
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
    
}
