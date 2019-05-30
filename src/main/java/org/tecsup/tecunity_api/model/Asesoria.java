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

    /*
    @ManyToMany
	@JoinTable(name="usuario_roles"
		,joinColumns=@JoinColumn(name="usuario_id")
		,inverseJoinColumns=@JoinColumn(name="role_id")
	)
private Set<Rol> roles;
    * */

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "asesoria_participante"
            , joinColumns = @JoinColumn(name = "id_asesoria", referencedColumnName = "id_asesoria")
            , inverseJoinColumns = @JoinColumn(name = "par_id", referencedColumnName = "par_id")
    )
    //@JsonIgnore
    private List<Participante> participantes = new ArrayList<>();

    public Asesoria(String tituloAsesoria, String descripcionAsesoria, String etiquetaAsesoria, String estadoAsesoria,
                    String tipoAsesoria, Curso curso, Horario horario, List<Participante> participantes) {
        this.tituloAsesoria = tituloAsesoria;
        this.descripcionAsesoria = descripcionAsesoria;
        this.etiquetaAsesoria = etiquetaAsesoria;
        this.estadoAsesoria = estadoAsesoria;
        this.tipoAsesoria = tipoAsesoria;
        this.curso = curso;
        this.horario = horario;
        this.participantes = participantes;
    }

    public Asesoria() {
    }

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

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
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
                ", participantes=" + participantes +
                '}';
    }
}
