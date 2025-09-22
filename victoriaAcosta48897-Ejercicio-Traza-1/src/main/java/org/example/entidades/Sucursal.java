package org.example.entidades;

import java.time.LocalTime;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
@SuperBuilder

public class Sucursal {
    private Long id;
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;

    private Empresa empresa;
    private Domicilio domicilio;
}
