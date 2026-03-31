package com.duoc.productos.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productos {

    @Positive(message = "Debe ser mayor a cero")
    private Integer id;

    @NotNull(message = "no puede ser nulo")
    @NotBlank(message = "no puede estar vacio")
    private String nombre;

    @Positive(message = "Debe ser mayor a cero")
    private int cantidad;

    @Positive(message = "Debe ser mayor a cero")
    private Integer precio;
}
