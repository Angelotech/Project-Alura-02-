package Service;

public interface ICinveterDados  {

    /*primeiro parametro a pessoa informa o json, segundo parametro a classe que vai receber os dados */
    <T> T obterDados (String json, Class<T> classe);
}
