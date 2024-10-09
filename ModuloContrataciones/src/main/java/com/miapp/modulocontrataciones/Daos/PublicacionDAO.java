package com.miapp.modulocontrataciones.Daos;

import com.miapp.sistemasdistribuidos.entity.Categoria;
import com.miapp.sistemasdistribuidos.entity.Publicacion;
import com.miapp.sistemasdistribuidos.entity.TipoDePrecio;
import com.miapp.sistemasdistribuidos.entity.Trabajador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublicacionDAO extends JpaRepository<Publicacion, Integer> {
    Page<Publicacion> findAll(Pageable pageable);
    Page<Publicacion> findAllByCategoriaId(Categoria categoria, Pageable pageable);
    Page<Publicacion> findAllByTrabajadorId(Trabajador trabajador, Pageable pageable);
    Page<Publicacion> findAllByTipoDePrecioId(TipoDePrecio tipoDePrecio, Pageable pageable);
}
