package ConexaoBanco.CadastroUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexao {
    public Connection getConectar(){
        try{
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/CadastroUsuario", "root", "");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
    }

    public static void main(String[] args) {
        try{
            new ConexaoBanco.CadastroUsuario.Conexao().getConectar();
            JOptionPane.showMessageDialog(null, " Conectar ");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, " Erro " + erro);
        }
    }
}
