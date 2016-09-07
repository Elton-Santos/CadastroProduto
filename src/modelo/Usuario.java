package modelo;

public class Usuario {
    Long id;
    String descricao;
    String codigo;
    String tipo;
    String quantidade;
    String preco;
    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(String quantidade){
        this.quantidade = quantidade;
    }
    public String getPreco (){
        return preco;
    }
    public void setPreco(String preco){
        this.preco = preco;
    }
}
