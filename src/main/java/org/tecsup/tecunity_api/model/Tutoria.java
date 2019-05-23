package org.tecsup.tecunity_api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tutoria")
public class Tutoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtutoria")
    private Integer idTutoria;

    private String titulo;

    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "horario_inicio")
    private Date horarioInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "horario_fin")
    private Date horarioFin;

    private Integer tipo;

    private String etiquetas;

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

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(Date horarioFin) {
        this.horarioFin = horarioFin;
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
                ", horarioInicio=" + horarioInicio +
                ", horarioFin=" + horarioFin +
                ", tipo=" + tipo +
                ", etiquetas='" + etiquetas + '\'' +
                ", estado=" + estado +
                '}';
    }
}
