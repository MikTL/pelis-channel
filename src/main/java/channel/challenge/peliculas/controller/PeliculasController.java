package channel.challenge.peliculas.controller;

import channel.challenge.peliculas.business.impl.IListarPelicula;
import channel.challenge.peliculas.controller.response.PeliculasResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/pelis")
public class PeliculasController {
    @Autowired
    private IListarPelicula iPelicula;
    @GetMapping
    PeliculasResponse listarPelis() throws IOException {
        return this.iPelicula.listar();
    }
}
