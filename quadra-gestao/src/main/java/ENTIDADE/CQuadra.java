package ENTIDADE;

public class CQuadra {

    //ATRIBUTOS
    private int id;
    private String nome;
    private String tipo;
    private float valorHora;

    //CONSTRUTOR
    public CQuadra(int id, String nome, String tipo, float valorHora) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valorHora = valorHora;
    }

    public CQuadra(String nome, String tipo, float valorHora) {
        this.nome = nome;
        this.tipo = tipo;
        this.valorHora = valorHora;
    }

    public CQuadra() {
    }

    //MÉTODOS

    public int getId (){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}
