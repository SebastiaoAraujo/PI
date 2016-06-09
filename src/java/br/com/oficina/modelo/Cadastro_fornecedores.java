package br.com.oficina.modelo;

public class Cadastro_fornecedores {
    private int codigo;
    private String razaosocial;
    private String cnpj_cpf;
    private String endereco;
    private String bairro;
    private String telefone;
    private String cidade;
    private String estado;
    private String email;
    private String contato;
    private String obeservacao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getObeservacao() {
        return obeservacao;
    }

    public void setObeservacao(String obeservacao) {
        this.obeservacao = obeservacao;
    }
@Override
	public String toString() {
		return "cadastro_fornecedor [codigo=" + codigo + ", razaosocial=" + razaosocial
				+ ", cnpj_cpf=" + cnpj_cpf + ", endereco=" + endereco + ", bairro="
				+ bairro + ", cidade="+cidade+", telefone="+telefone+", email="+email+", estado="+estado+
                                                                                    ", contato="+contato+", observacao="+obeservacao+"]";
}

    public Cadastro_fornecedores(int codigo, String razaosocial, String cnpj_cpf, String endereco, String bairro, String telefone, String cidade, String estado, String email, String contato, String obeservacao) {
        this.codigo = codigo;
        this.razaosocial = razaosocial;
        this.cnpj_cpf = cnpj_cpf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.contato = contato;
        this.obeservacao = obeservacao;
    }

    public Cadastro_fornecedores() {
    }
    
}
