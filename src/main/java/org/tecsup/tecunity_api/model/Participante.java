package org.tecsup.tecunity_api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "participante")
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "par_id")
    private Integer idParticipante;
    
    @Column(name = "par_nombre")
    private String nombre;
    
    @Column(name = "par_apellido")
    private String apellido;

    @Column(name = "par_usuario")
    private String usuario;

    @Column(name = "par_email")
    private String email;

    @Column(name = "par_foto")
    private String foto;

    @Column(name = "par_celular")
    private String celular;
    
    @Column(name = "par_ciclo")
    private Integer ciclo;    

    public Integer getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Integer idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

	@Override
	public String toString() {
		return "Participante ["
				+ "idParticipante=" + idParticipante +
				", nombre=" + nombre + 
				", apellido=" + apellido +
				", usuario=" + usuario +
				", email=" + email + 
				", foto=" + foto +
				", celular=" + celular +
				", ciclo=" + ciclo + "]";
	}

    
}
