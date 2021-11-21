package br.edu.infnet.Tp3Elberth.controller;

import br.edu.infnet.Tp3Elberth.model.Usuario;
import br.edu.infnet.Tp3Elberth.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @Autowired
    private AppService appService;


    @GetMapping("/")
    public String telaCadastro(){
        return "cadastro";
    }

    @PostMapping("/cadastrar")
    public String salvar(Model model, Usuario usuario){
        return appService.salvar(model, usuario);

    }

    @GetMapping("/login")
    public String telaLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam("email") String email, @RequestParam("senha") String senha){
        return appService.login(model, email, senha);
    }
}
