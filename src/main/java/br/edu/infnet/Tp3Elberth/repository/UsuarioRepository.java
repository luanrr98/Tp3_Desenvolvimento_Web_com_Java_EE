package br.edu.infnet.Tp3Elberth.repository;

import br.edu.infnet.Tp3Elberth.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {

    @Query("from Usuario user where user.email =:email and user.senha =:senha")
    public Usuario autenticacao(String email, String senha);

    @Query("from Usuario user where user.email =:email")
    public Usuario duplicidade(String email);

}
