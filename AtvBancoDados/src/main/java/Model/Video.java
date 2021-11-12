
package Model;


public class Video {
    private String url_video;
    private String nome_video;
    private String nome_dono;
    private String tipo_video;

    public Video(String url_video, String nome_video, String nome_dono, String tipo_video) {
        this.url_video = url_video;
        this.nome_video = nome_video;
        this.nome_dono = nome_dono;
        this.tipo_video = tipo_video;
    }

    public Video() {
        this.url_video = "";
        this.nome_video = "";
        this.nome_dono = "";
        this.tipo_video = "";
    }

    public String getUrl_video() {
        return url_video;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }

    public String getNome_video() {
        return nome_video;
    }

    public void setNome_video(String nome_video) {
        this.nome_video = nome_video;
    }

    public String getNome_dono() {
        return nome_dono;
    }

    public void setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
    }

    public String getTipo_video() {
        return tipo_video;
    }

    public void setTipo_video(String tipo_video) {
        this.tipo_video = tipo_video;
    }
    

}
