package com.softtek.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "alumnos_profesores")
@IdClass(AlumnoProfesorPK.class)
public class AlumnoProfesor implements Serializable {
    @Id
    private Profesor profesor;
    @Id
    private Alumno alumno;


    //aqui se pondran el resto de atributos en caso de haberlos
}
