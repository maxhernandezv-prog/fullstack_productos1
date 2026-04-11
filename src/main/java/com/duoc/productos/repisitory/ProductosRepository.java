package com.duoc.productos.repisitory;

import com.duoc.productos.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {}
