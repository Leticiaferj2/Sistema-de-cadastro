package br.com.lista.Eventoapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Service;




@Service
@Entity
public class Eventos implements Serializable {
	 
	private static final long serialVersionUID= 1L;
	
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	
	@NotEmpty
	private String nome;
	
	
	@NotEmpty
	private String telefone;
	
	@NotEmpty
	private String Local;
	
	@NotEmpty
	private String data;
	
	@NotEmpty
	private String horario;
	
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String senha;
	
	
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLocal() {
		return Local;
	}
	public void setLocal(String local) {
		Local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}