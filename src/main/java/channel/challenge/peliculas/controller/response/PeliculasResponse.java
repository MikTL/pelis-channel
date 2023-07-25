package channel.challenge.peliculas.controller.response;

import channel.challenge.peliculas.proxy.response.ProxyListarPeliculaRes;
import channel.challenge.peliculas.proxy.response.ProxyPeliculasResponse;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class PeliculasResponse {

    private List<ListPeliculasRes> content;

    public PeliculasResponse(ProxyPeliculasResponse proxiPelis){
        this.content = convertirProxiPelis(proxiPelis.getContent());
    }
    private List<ListPeliculasRes> convertirProxiPelis(List<ProxyListarPeliculaRes> pelicula){
        List<ListPeliculasRes> resultList= new ArrayList<>();

        for (ProxyListarPeliculaRes proxyItem: pelicula) {
            ListPeliculasRes resultItem= new ListPeliculasRes();
            resultItem.setTitulo(proxyItem.getTitulo());
            resultItem.setAnio(proxyItem.getAnio());
            resultItem.setMinutosDuracion(proxyItem.getMinutosDuracion());
            resultItem.setDescripcion(proxyItem.getDescripcion());
            resultList.add(resultItem);
        }
        return resultList;
    }
}
