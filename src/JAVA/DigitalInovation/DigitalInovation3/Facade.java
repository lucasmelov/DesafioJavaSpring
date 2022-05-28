package JAVA.DigitalInovation.DigitalInovation3;

import JAVA.DigitalInovation.crm.CrmService;
import JAVA.DigitalInovation.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}