package channel.challenge.peliculas.proxy.response;

import lombok.Data;

@Data
public class ProxyListarPeliculaRes {
    private String titulo;
    private int anio;
    private int minutosDuracion;
    private String descripcion;

}
