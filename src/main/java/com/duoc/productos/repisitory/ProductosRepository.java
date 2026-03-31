package com.duoc.productos.repisitory;

import com.duoc.productos.model.Productos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ProductosRepository {

    private List<Productos> listaProductos = new ArrayList<>();

    public Productos guardar(Productos producto){
        listaProductos.add(producto);
        return producto;
    }

    public List<Productos> listar(){
        return listaProductos;
    }

    public Productos BuscarPorId(Integer id){
        //opcion 1
        return listaProductos.stream().filter(producto -> producto.getId().equals(id)).findFirst().orElse(null);

        // opcion 2
        //for(int i = 0; i < listaProductos.size(); i++){
        //if(listaProductos.get(i).getId().equals(id)){
        //      return listaProductos.get(i);
        //    }
        //}
    }

    public Productos actualizar(Integer id, Productos producto){
        int posicion = 0;
        for (int i = 0; i < listaProductos.size(); i++){
            if (listaProductos.get(i).getId().equals(id)){
                posicion = i;
                break;
            }
        }

        Productos productosNuevo = new Productos();
        productosNuevo.setId(id);
        productosNuevo.setNombre(producto.getNombre());
        productosNuevo.setCantidad(producto.getCantidad());
        productosNuevo.setPrecio(producto.getPrecio());

        listaProductos.set(posicion, productosNuevo);
        return productosNuevo;
    }

    public void eliminar(Integer id){
        listaProductos.removeIf(producto -> producto.getId().equals(id));
    }
}
