/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.table_jpa.serviceImpl;

import com.example.table_jpa.entity.Categoria;
import com.example.table_jpa.repository.CategoriaRepository;
import com.example.table_jpa.services.Operaciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class CategoriaService implements Operaciones<Categoria>{
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Override
    public Categoria create(Categoria t) {
        return categoriaRepository.save(t);
    }

    @Override
    public Categoria update(Categoria t) {
        return categoriaRepository.save(t);
    }

    @Override
    public void delete(int id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public Categoria read(int id) {
        return categoriaRepository.findById(id).get();
    }

    @Override
    public List<Categoria> readAll() {
        return categoriaRepository.findAll();
    }
    
}
