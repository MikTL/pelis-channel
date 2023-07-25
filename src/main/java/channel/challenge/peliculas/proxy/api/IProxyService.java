package channel.challenge.peliculas.proxy.api;

import channel.challenge.peliculas.proxy.response.ProxyPeliculasResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IProxyService {
    @GET("/peliculas")
    Call<ProxyPeliculasResponse> listarPeliculas();
}
