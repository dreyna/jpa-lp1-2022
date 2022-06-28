/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.table_jpa.serviceImpl;

import com.example.table_jpa.entity.Producto;
import com.example.table_jpa.repository.ProductoRepository;
import com.example.table_jpa.services.Operaciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductoService implements Operaciones<Producto>{
@Autowired
private ProductoRepository productoRepository;
    @Override
    public Producto create(Producto t) {
        return productoRepository.save(t);
    }

    @Override
    public Producto update(Producto t) {
        return productoRepository.save(t);
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> readAll() {
        return productoRepository.findAll();
    }
    
}
