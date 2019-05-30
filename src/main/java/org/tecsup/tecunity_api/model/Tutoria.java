package org.tecsup.tecunity_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "asesoria")
public class Tutoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asesoria")
    private Integer idTutoria;

    @Column(name = "ase_titulo")
    private String titulo;

    @Column(name = "ase_descripcion")
    private String descripcion;

    /**@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "horario_inicio")
    private Date horarioInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "horario_fin")
    private Date horarioFin;*/
    
    @Column(name = "ase_tipo")
    private Integer tipo;

    @Column(name = "ase_etiqueta")
    private String etiquetas;

    @Column(name = "ase_estado")
    private Boolean estado;

    public Integer getIdTutoria() {
        return idTutoria;
    }

    public void setIdTutoria(Integer idTutoria) {
        this.idTutoria = idTutoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tutoria{" +
                "idTutoria=" + idTutoria +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                ", etiquetas='" + etiquetas + '\'' +
                ", estado=" + estado +
                '}';
    }
}
