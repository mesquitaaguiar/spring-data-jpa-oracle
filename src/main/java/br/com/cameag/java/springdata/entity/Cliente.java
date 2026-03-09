package br.com.cameag.java.springdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="CLIENTE2", schema = "CURSO")
public class Cliente implements Serializable {
	
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long cliente_id;

    @Column(name = "nome", length = 255, nullable = false)
    private String cliente_nome;

    @Column(name = "idade", nullable = false)
    private Integer cliente_idade;

    @Column(name = "endereco", length = 255, nullable = true)
    private String cliente_endereco;

    @Column(name = "documento", length = 255, nullable = true)
    private String cliente_documento;

    @Column(name = "telefone", length = 255, nullable = false)
    private String cliente_telefone;

    @Column(name = "nacionalidade", length = 255, nullable = false)
    private String cliente_nacionalidade;

    public Long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getCliente_nome() {
		return cliente_nome;
	}

	public void setCliente_nome(String cliente_nome) {
		this.cliente_nome = cliente_nome;
	}

	public Integer getCliente_idade() {
		return cliente_idade;
	}

	public void setCliente_idade(Integer cliente_idade) {
		this.cliente_idade = cliente_idade;
	}

	public String getCliente_endereco() {
		return cliente_endereco;
	}

	public void setCliente_endereco(String cliente_endereco) {
		this.cliente_endereco = cliente_endereco;
	}

	public String getCliente_documento() {
		return cliente_documento;
	}

	public void setCliente_documento(String cliente_documento) {
		this.cliente_documento = cliente_documento;
	}

	public String getCliente_telefone() {
		return cliente_telefone;
	}

	public void setCliente_telefone(String cliente_telefone) {
		this.cliente_telefone = cliente_telefone;
	}

	public String getCliente_nacionalidade() {
		return cliente_nacionalidade;
	}

	public void setCliente_nacionalidade(String cliente_nacionalidade) {
		this.cliente_nacionalidade = cliente_nacionalidade;
	}

	@Override
    public int hashCode() {
        return 2021;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        return cliente_id != null && cliente_id == (((Cliente) obj).cliente_id);
    }

    @Override
    public String toString() {
        return "Cliente{" + "cliente_id=" + cliente_id
                + ", cliente_nome=" + cliente_nome
                	+ ", cliente_idade=" + cliente_idade
                		+ ", cliente_endereco=" + cliente_endereco
            				+ ", cliente_documento=" + cliente_documento
            					+ ", cliente_documento=" + cliente_documento
                					+ ", cliente_nacionalidade=" + cliente_nacionalidade + '}';
    }
}
