/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.table_jpa.controller;

import com.example.table_jpa.serviceImpl.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/prod")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/all")
    public String index(Model model){
       model.addAttribute("productos", productoService.readAll());
        return "producto/listprod";
    }
}
