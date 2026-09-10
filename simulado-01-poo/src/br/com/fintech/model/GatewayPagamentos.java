package br.com.fintech.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GatewayPagamentos {
    Map <String, CarteiraDigital> carteiras;

    public GatewayPagamentos() {
        this.carteiras = new HashMap<>();
    }

    public void cadastrarCarteira(CarteiraDigital carteira){
        carteiras.put(carteira.getCodigoCarteira(), carteira);
    }

    public Optional<CarteiraDigital> buscarCarteira(String codigoCarteira){
        return Optional.ofNullable(carteiras.get(codigoCarteira));
    }
}
