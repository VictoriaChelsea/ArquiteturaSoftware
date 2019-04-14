package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);

}