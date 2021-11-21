package br.edu.infnet.Tp3Elberth.service;

import br.edu.infnet.Tp3Elberth.model.Usuario;
import br.edu.infnet.Tp3Elberth.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AppService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public String salvar(Model model, Usuario usuario) {
        model.addAttribute("user",usuario);
        if(!usuario.getNome().matches("[a-zA-Z]*")){
            model.addAttribute("msg","Nome Inválido!!");
            return "cadastro";
        }
        if(usuario.equals(usuarioRepository.duplicidade(usuario.getEmail()))){
            model.addAttribute("msg","Email já cadastrado");
            return "cadastro";
        }
        usuarioRepository.save(usuario);
        return "sucesso";
    }

    public String login(Model model, String email, String senha){
        Usuario usuario = usuarioRepository.autenticacao(email, senha);
        if(usuario!=null){
            model.addAttribute("user",usuario);
            return "sucessologin";
        }else{
            model.addAttribute("msg", "Credênciais Inválidas!!");
            return "/login";
        }
    }

}
