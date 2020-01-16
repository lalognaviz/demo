package com.lalo.demo.service;

import com.lalo.demo.modelos.Videojuego;
import com.lalo.demo.repository.VideoJuegoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoJuegoService {

    @Autowired
    private VideoJuegoRepository videojuegorepository;
    /*private final VideoJuegoRepository videojuegorepository;

    public VideoJuegoService(VideoJuegoRepository videojuegorepository) {
        this.videojuegorepository = videojuegorepository;
    }*/

    public List<Videojuego> buscarDestacados() {
        return videojuegorepository.findAll();
    }
;

}
