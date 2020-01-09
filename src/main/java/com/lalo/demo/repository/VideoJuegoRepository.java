package com.lalo.demo.repository;

import com.lalo.demo.modelos.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoJuegoRepository extends JpaRepository<Videojuego, Integer> {
    
}
