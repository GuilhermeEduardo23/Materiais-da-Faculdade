package Menu;

import java.sql.Connection;
import java.sql.DriverManager;

public class UnicaConexao {
    public Connection con = null;
    
    public static void main(String[]args){
        
    }
    
    public void conectar(){
        VariaveisPublicas var = new VariaveisPublicas();
        
       String url = "jdbc:postgresql://localhost:5432/Gerenciamento_de_Notas";
       String usuario = "postgres";
       String senha = "123456";
       
      try       {
           Class.forName("org.postgresql.Driver");
           Connection conn = DriverManager.getConnection(url, usuario, senha);
           var.setConexao(conn);
                   
           System.out.println("Conexão realizada com êxito!!");
     }
       
       catch(Exception e){
           e.printStackTrace();
       }
    }
}
