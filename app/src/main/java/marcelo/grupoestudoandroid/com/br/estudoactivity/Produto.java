package marcelo.grupoestudoandroid.com.br.estudoactivity;

/**
 * Created by dragonjf on 26/06/16.
 */
public class Produto {
    Integer idProduto;
    String nomeStr;
    String unidadeStr;
    String categoria;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeStr() {
        return nomeStr;
    }

    public void setNomeStr(String nomeStr) {
        this.nomeStr = nomeStr;
    }

    public String getUnidadeStr() {
        return unidadeStr;
    }

    public void setUnidadeStr(String unidadeStr) {
        this.unidadeStr = unidadeStr;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
