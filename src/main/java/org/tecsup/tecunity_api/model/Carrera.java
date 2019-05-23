package org.tecsup.tecunity_api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "carrera")
public class Carrera implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcarrera")
    private Integer idCarrera;

    private String nombre;
}
