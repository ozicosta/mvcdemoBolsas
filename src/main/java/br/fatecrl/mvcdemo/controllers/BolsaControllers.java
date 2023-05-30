package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Bolsa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bolsas")

public class BolsaControllers {
    private static final List<Bolsa> bolsas = new ArrayList<Bolsa>();
    public BolsaControllers() {
        bolsas.add(new Bolsa("Ana", "P", 100));
        bolsas.add(new Bolsa("Luna", "M", 110));
        bolsas.add(new Bolsa("Crystal", "P", 130));
        bolsas.add(new Bolsa("Sol", "M", 150));
    }
    @GetMapping
    public String getBolsa(Model model) {

        model.addAttribute("bolsas", bolsas);
        return "bolsas";
    }
}
