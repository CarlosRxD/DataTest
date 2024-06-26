package com.rodolfo.DataTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force=true)
@Entity
public class Protocolo {
    @Id
    private String matricula;
    private String nombre;
    private String apellidos;
    private String carrera;
    private String tituloTesis;
    private String directorTesis;
    private String codirectorTesis;
}
