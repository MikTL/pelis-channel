package channel.challenge.peliculas.proxy.api;

import channel.challenge.peliculas.proxy.response.ProxyPeliculasResponse;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;

@Service
public class IProxyServiceImpl implements IProxyService{
    private final IProxyService proxyService;

    public IProxyServiceImpl(Retrofit retrofit){
        this.proxyService=retrofit.create(IProxyService.class);
    }
    @Override
    public Call<ProxyPeliculasResponse> listarPeliculas() {
        return proxyService.listarPeliculas();
    }
}
