package Menu;

import java.sql.Connection;

public class VariaveisPublicas {
    public static Connection ConexaoPadrao = null;
    
    public Connection getConexao(){
        return VariaveisPublicas.ConexaoPadrao;
    }
    
    public void setConexao(Connection ConexaoPadrao){
        VariaveisPublicas.ConexaoPadrao = ConexaoPadrao;
    }
}
