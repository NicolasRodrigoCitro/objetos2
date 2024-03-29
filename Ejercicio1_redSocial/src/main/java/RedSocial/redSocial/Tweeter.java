package RedSocial.redSocial;

import java.util.ArrayList;
import java.util.List;


public class Tweeter {

	
	private List<Usuario> usuarios;
	
	public Tweeter() {
		this.usuarios = new ArrayList<>();
	}
	
	public boolean agregarUsuario(Usuario unUsuario) {
		if(this.usuarios.stream().anyMatch(usuarioAux -> usuarioAux.getNombre().equals(unUsuario.getNombre()))) {
				return false;
			}
		this.usuarios.add(unUsuario);
		return true;
		
		
	}

	public boolean existeUsuario(Usuario usuario) {
		return (this.usuarios.contains(usuario));
	}

	public void eliminarUsuario(Usuario usuario) {
		if(this.existeUsuario(usuario)) {
			usuario.eliminarTweets();
			this.usuarios.remove(usuario);
		}
	}
}
