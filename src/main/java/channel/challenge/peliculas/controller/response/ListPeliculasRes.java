package channel.challenge.peliculas.controller.response;

import lombok.Data;

@Data
public class ListPeliculasRes {
    private String titulo;
    private int anio;
    private int minutosDuracion;
    private String descripcion;
}
