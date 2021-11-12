
package Model;


public class Site {
    private String url_site;
    private String nome_site;
    private String tipo_site;

    public Site(String url_site, String nome_site, String tipo_site) {
        this.url_site = url_site;
        this.nome_site = nome_site;
        this.tipo_site = tipo_site;
    }

    public Site() {
     this.url_site = "";
     this.nome_site = "";
     this.tipo_site = "";   
    }

    public String getUrl_site() {
        return url_site;
    }

    public void setUrl_site(String url_site) {
        this.url_site = url_site;
    }

    public String getNome_site() {
        return nome_site;
    }

    public void setNome_site(String nome_site) {
        this.nome_site = nome_site;
    }

    public String getTipo_site() {
        return tipo_site;
    }

    public void setTipo_site(String tipo_site) {
        this.tipo_site = tipo_site;
    }
    
  
}
