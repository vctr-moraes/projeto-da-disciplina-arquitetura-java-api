package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import model.domain.Informacao;
import model.service.InformacaoService;
import java.util.List;

@RestController
@RequestMapping("/api/informacao")
public class InformacaoController {
    @Autowired
    private InformacaoService informacaoService;

    @GetMapping(value = "/lista")
    public List<Informacao> listar(){
        return informacaoService.listar();
    }

    @PostMapping(value = "/incluir")
    public Informacao incluir(@RequestBody Informacao informacao) {
        return informacaoService.incluir(informacao);
    }
}