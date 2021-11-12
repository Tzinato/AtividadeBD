
package Model;


public class Cliente {
   private int login_cliente;
   private String nome_cliente;
   private String email;

    public Cliente(int logincliente, String nomecliente, String emailcliente) {
        this.login_cliente = logincliente;
        this.nome_cliente = nomecliente;
        this.email = emailcliente;
    }

    public Cliente() {
         this.login_cliente = 0;
        this.nome_cliente = "";
        this.email = "";
    }
    

    public String getNomecliente() {
        return nome_cliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nome_cliente = nomecliente;
    }
    

    public int getLogincliente() {
        return login_cliente;
    }

    public void setLogincliente(int logincliente) {
        this.login_cliente = logincliente;
    }

    public String getEmailcliente() {
        return email;
    }

    public void setEmailcliente(String emailcliente) {
        this.email = emailcliente;
    }
   
}
