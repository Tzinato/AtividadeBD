
package Model;


public class Avaliador {
    private String cpf;
    private String nome_avaliador;
    private int login; 
    private String email;

    public Avaliador(String cpf, String nome_avaliador, int login, String email) {
        this.cpf = cpf;
        this.nome_avaliador = nome_avaliador;
        this.login = login;
        this.email = email;
    }

    public Avaliador() {
        this.cpf = "";
        this.nome_avaliador = "";
        this.login = 0;
        this.email = "";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_avaliador() {
        return nome_avaliador;
    }

    public void setNome_avaliador(String nome_avaliador) {
        this.nome_avaliador = nome_avaliador;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
