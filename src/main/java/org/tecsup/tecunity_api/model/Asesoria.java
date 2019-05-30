package org.tecsup.tecunity_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.servlet.http.Part;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "asesoria")
public class Asesoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asesoria")
    private Integer idAsesoria;

    @Column(name = "ase_titulo")
    private String tituloAsesoria;

    @Column(name = "ase_descripcion")
    private String descripcionAsesoria;

    @Column(name = "ase_etiqueta")
    private String etiquetaAsesoria;

    @Column(name = "ase_estado")
    private String estadoAsesoria;

    @Column(name = "ase_tipo")
    private String tipoAsesoria;

    @ManyToOne
    @JoinColumn(name = "curso_curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "horario_id_horario")
    private Horario horario;

    public Integer getIdAsesoria() {
        return idAsesoria;
    }

    public void setIdAsesoria(Integer idAsesoria) {
        this.idAsesoria = idAsesoria;
    }

    public String getTituloAsesoria() {
        return tituloAsesoria;
    }

    public void setTituloAsesoria(String tituloAsesoria) {
        this.tituloAsesoria = tituloAsesoria;
    }

    public String getDescripcionAsesoria() {
        return descripcionAsesoria;
    }

    public void setDescripcionAsesoria(String descripcionAsesoria) {
        this.descripcionAsesoria = descripcionAsesoria;
    }

    public String getEtiquetaAsesoria() {
        return etiquetaAsesoria;
    }

    public void setEtiquetaAsesoria(String etiquetaAsesoria) {
        this.etiquetaAsesoria = etiquetaAsesoria;
    }

    public String getEstadoAsesoria() {
        return estadoAsesoria;
    }

    public void setEstadoAsesoria(String estadoAsesoria) {
        this.estadoAsesoria = estadoAsesoria;
    }

    public String getTipoAsesoria() {
        return tipoAsesoria;
    }

    public void setTipoAsesoria(String tipoAsesoria) {
        this.tipoAsesoria = tipoAsesoria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Asesoria{" +
                "idAsesoria=" + idAsesoria +
                ", tituloAsesoria='" + tituloAsesoria + '\'' +
                ", descripcionAsesoria='" + descripcionAsesoria + '\'' +
                ", etiquetaAsesoria='" + etiquetaAsesoria + '\'' +
                ", estadoAsesoria='" + estadoAsesoria + '\'' +
                ", tipoAsesoria='" + tipoAsesoria + '\'' +
                ", curso=" + curso +
                ", horario=" + horario +
                '}';
    }
}
