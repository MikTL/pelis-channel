package channel.challenge.peliculas.business.intf;

import channel.challenge.peliculas.business.impl.IListarPelicula;
import channel.challenge.peliculas.controller.response.PeliculasResponse;
import channel.challenge.peliculas.proxy.api.intf.IServiceAPI;
import channel.challenge.peliculas.proxy.response.ProxyPeliculasResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IListarPeliculaImpl implements IListarPelicula {
    @Autowired
    private IServiceAPI serviceAPI;
    @Override
    public PeliculasResponse listar() {
        ProxyPeliculasResponse response= serviceAPI.listarPeliculas();
        PeliculasResponse pelisResponse= new PeliculasResponse(response);
        return pelisResponse;
    }
}
