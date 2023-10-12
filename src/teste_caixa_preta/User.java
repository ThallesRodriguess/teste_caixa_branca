package teste_caixa_preta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * A classe User representa um usuário e fornece métodos para conectar ao banco de dados,
 * verificar se um usuário existe e obter o nome do usuário.
 */
public class User {

    /**
     * Este método estabelece uma conexão com o banco de dados MySQL.
     *
     * @return Uma conexão com o banco de dados ou null em caso de erro.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega a classe do driver MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceção para possíveis erros
        }
        return conn;
    }

    /**
     * Variável para armazenar o nome do usuário.
     */
    public String nome = "";

    /**
     * Variável que indica se a verificação do usuário foi bem-sucedida.
     */
    public boolean result = false;

    /**
     * Este método verifica se um usuário com o login e senha fornecidos existe no banco de dados.
     *
     * @param login O nome de usuário para verificar.
     * @param senha A senha do usuário para verificar.
     * @return true se o usuário existe e false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        
        // INSTRUÇÃO SQL para verificar o usuário
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Tratamento de exceção para possíveis erros
        }
        return result;
    }
}//fim da classe






