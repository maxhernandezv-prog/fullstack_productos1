package com.duoc.productos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductosRequest {

    @NotBlank(message = "el nombre no puede estar vacio")
    private String nombre;

    @Positive(message = "La cantidad debe ser mayor a cero")
    @NotNull(message = "La cantidad es obligatoria")
    private Integer cantidad;

    @Positive(message = "La cantidad debe ser mayor a cero")
    @NotNull(message = "La cantidad es obligatoria")
    private Integer precio;
}
