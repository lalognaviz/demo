package com.lalo.demo.controller;

import com.lalo.demo.modelos.Videojuego;
import com.lalo.demo.service.VideoJuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

//    @Autowired
//    private final VideoJuegoService videojuegoService;
    private final VideoJuegoService videojuegoService;

    public ListadoController(VideoJuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuego(Model model) {
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/sogtulad2")
    public String listarVideos() {

        return "listardo";
    }

}
