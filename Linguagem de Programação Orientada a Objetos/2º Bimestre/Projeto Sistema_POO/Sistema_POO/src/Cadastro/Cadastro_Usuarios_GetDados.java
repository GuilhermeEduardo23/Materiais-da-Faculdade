package Cadastro;


public class Cadastro_Usuarios_GetDados {
    
    public static String yCodUsuario;
    public static String yUsuario;
    public static String ySenha;
    
    public String getCodUsuario(){
        return Cadastro_Usuarios_GetDados.yCodUsuario;
    }
    
    public String getUsuario(){
        return Cadastro_Usuarios_GetDados.yUsuario;
    }
    
    public String getSenha(){
        return Cadastro_Usuarios_GetDados.ySenha;
    }
    
    public void setCodUsuario(String yCodUsuario){
        Cadastro_Usuarios_GetDados.yCodUsuario = yCodUsuario;
    }
    
    public void setUsuario(String yUsuario){
        Cadastro_Usuarios_GetDados.yUsuario = yUsuario;
    }
    
    public void setSenha(String ySenha){
        Cadastro_Usuarios_GetDados.ySenha = ySenha;
    }
}
