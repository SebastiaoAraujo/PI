package br.com.oficina.modelo;

/**
 *
 * @author SEBASTYANN
 */
public class Cadastro_pecas {
    private int id;
    private int codigo_peca;
    private String nome_peca;
    private int quantidade;
    private String marca;
    private int estq_minimo;
    private String observacao;
    private float valorvenda;
    private float valorcompra;

       public Cadastro_pecas(int id, String nome_peca, int quantidade, String marca, int estq_minimo, String observacao, float valorcompra, float valorvenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cadastro_pecas() {
        
    }

    
    public float getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(float valorcompra) {
        this.valorcompra = valorcompra;
    }

    public float getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(float valorvenda) {
        this.valorvenda = valorvenda;
    }
       public int getId() {
        return id;
    }
       
    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_peca() {
        return codigo_peca;
    }

    public void setCodigo_peca(int codigo_peca) {
        this.codigo_peca = codigo_peca;
    }

    public String getNome_peca() {
        return nome_peca;
    }

    public void setNome_peca(String nome_peca) {
        this.nome_peca = nome_peca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstq_minimo() {
        return estq_minimo;
    }

    public void setEstq_minimo(int estq_minimo) {
        this.estq_minimo = estq_minimo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    @Override
	public String toString() {
		return "cadastro_pecas [id=" + id + ", codigo_peca=" + codigo_peca
				+ ", nome_peca=" + nome_peca + ", quantidade=" + quantidade + ", marca="
				+ marca + "estq_minimo"+ estq_minimo+"observacao"+ observacao+"]";  
}
}
