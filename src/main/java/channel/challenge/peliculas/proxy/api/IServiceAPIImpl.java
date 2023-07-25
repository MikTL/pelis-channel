package channel.challenge.peliculas.proxy.api;

import channel.challenge.peliculas.proxy.api.intf.IServiceAPI;
import channel.challenge.peliculas.proxy.response.ProxyPeliculasResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

@Service
public class IServiceAPIImpl implements IServiceAPI {

    @Autowired
    private IProxyService proxyService;

    @Override
    public ProxyPeliculasResponse listarPeliculas() {
        Call<ProxyPeliculasResponse> call = proxyService.listarPeliculas();
        try {
            Response<ProxyPeliculasResponse> response = call.execute();
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
