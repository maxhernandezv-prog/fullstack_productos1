package com.duoc.productos.service;

import com.duoc.productos.dto.ProductoDTO;
import com.duoc.productos.dto.ProductosRequest;
import com.duoc.productos.model.Productos;
import com.duoc.productos.repisitory.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
    //hola
    @Autowired
    private ProductosRepository productosRepository;

    public ProductoDTO guardar(ProductosRequest request){
        Productos producto = new Productos();
        producto.setNombre(producto.getNombre());
        producto.setCantidad(producto.getCantidad());
        producto.setPrecio(producto.getPrecio());

        Productos guardado =productosRepository.save(producto);
        return convertirADTO(guardado);
    }
    /*
    public List<Productos> listar(){
        return productosRepository.listar();
    }

    public Productos buscarPorId(Integer id){
        return productosRepository.BuscarPorId(id);
    }

    public Productos actualizar(Integer id, Productos productos){
        return productosRepository.actualizar(id,productos);
    }

    public void eliminar(Integer id){
        productosRepository.eliminar(id);
    }

     */
    private ProductoDTO convertirADTO(Productos producto) {
        ProductoDTO dto = new ProductoDTO();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setCantidad(producto.getCantidad());
        dto.setPrecio(producto.getPrecio());
        return dto;
    }
}
