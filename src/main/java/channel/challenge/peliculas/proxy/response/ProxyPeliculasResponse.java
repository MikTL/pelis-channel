package channel.challenge.peliculas.proxy.response;

import lombok.Data;

import java.util.List;
@Data
public class ProxyPeliculasResponse {
    private List<ProxyListarPeliculaRes> content;
}
