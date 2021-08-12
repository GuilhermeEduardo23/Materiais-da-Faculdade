package LimpaTudo;


public class Cadastro_Classificacao_GetDados {
    
    public static String yCodClas;
    public static String yClassificacao;
    public static String yObservacoes;
    
    public String getCodClas(){
        return Cadastro_Classificacao_GetDados.yCodClas;
    }
    
    public String getClassificacao(){
        return Cadastro_Classificacao_GetDados.yClassificacao;
    }
    
    public String getObservacoes(){
        return Cadastro_Classificacao_GetDados.yObservacoes;
    }
    
    public void setCodClas(String yCodClas){
        Cadastro_Classificacao_GetDados.yCodClas = yCodClas;
    }
    
    public void setClassificacao(String yClassificacao){
        Cadastro_Classificacao_GetDados.yClassificacao = yClassificacao;
    }
    
    public void setObservacoes(String yObservacoes){
        Cadastro_Classificacao_GetDados.yObservacoes = yObservacoes;
    }
}