package dao;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Usuario;

public class UsuarioDao {
    private final Connection connection;
    Long id;
    String descricao;
    String codigo;
    String tipo;
    String quantidade;
    String preco;
    
    public UsuarioDao() throws SQLException{
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario((descricao,codigo, tipo,quantidade, preco) VALUEs(?,?,?,?,?)";
                try{
                    PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1, usuario.getDescricao());
                    stmt.setString(2, usuario.getCodigo());
                    stmt.setString(3, usuario.getTipo());
                    stmt.setString(4, usuario.getQuantidade());
                    stmt.setString(5, usuario.getPreco());
                    
                } catch (SQLException u){
                    throw new RuntimeException(u);  
                }
    }
}
