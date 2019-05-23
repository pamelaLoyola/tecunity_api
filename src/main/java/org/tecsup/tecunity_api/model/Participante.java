package org.tecsup.tecunity_api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "participante")
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idparticipante")
    private Integer idParticipante;

    private String nombre;

    private String usuario;

    private String email;

    private String foto;

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

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "idParticipante=" + idParticipante +
                ", nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                ", email='" + email + '\'' +
                ", foto='" + foto + '\'' +
                ", ciclo=" + ciclo +
                '}';
    }
}
