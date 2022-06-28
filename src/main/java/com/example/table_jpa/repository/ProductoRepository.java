
package com.example.table_jpa.repository;

import com.example.table_jpa.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
