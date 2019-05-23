package org.tecsup.tecunity_api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcurso")
    private Integer idCurso;

    private String nombre;

}
