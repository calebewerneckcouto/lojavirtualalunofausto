package Faustus.loja_virtual_mentoria.service;

import Faustus.loja_virtual_mentoria.model.Acesso;
import Faustus.loja_virtual_mentoria.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {

    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso) {
        /*Qualquer tipo de validação*/
        return acessoRepository.save(acesso);
    }
}
