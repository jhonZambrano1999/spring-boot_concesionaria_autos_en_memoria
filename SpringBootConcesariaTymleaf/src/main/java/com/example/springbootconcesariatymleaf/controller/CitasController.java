package com.example.springbootconcesariatymleaf.controller;

import com.example.springbootconcesariatymleaf.servicio.CitasService;
import com.example.springbootconcesariatymleaf.servicio.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/citas")
public class CitasController {

    private final CitasService citasService;
    private final ClienteService clienteService;

    public CitasController(CitasService citasService, ClienteService clienteService) {
        this.citasService = citasService;
        this.clienteService = clienteService;
    }
}
