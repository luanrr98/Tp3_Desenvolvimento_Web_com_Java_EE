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

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario login(String email, String senha){
        return usuarioRepository.autenticacao(email, senha);
    }


}
