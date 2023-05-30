package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Bolsa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bolsas")
public class BolsaApiControllers {
    private static final List<Bolsa> bolsas = new ArrayList<Bolsa>();
    public BolsaApiControllers() {
        bolsas.add(new Bolsa("Ana", "M", 100));
        bolsas.add(new Bolsa("Luna", "M", 110));
        bolsas.add(new Bolsa("Crystal", "M", 130));
        bolsas.add(new Bolsa("Sol", "P", 150));
    }
    @GetMapping
    public List<Bolsa>getBolsas()
    {
        return bolsas;
    }
}
