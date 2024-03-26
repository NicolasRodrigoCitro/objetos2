package RedSocial.redSocial;

import java.util.ArrayList;
import java.util.List;


public class Tweeter {

	
	private List<Usuario> usuarios;
	
	public Tweeter() {
		this.usuarios = new ArrayList<>();
	}
	
	public boolean agregarUsuario(Usuario unUsuario) {
		if(unUsuario != null) {
			Usuario usarioHabilitado = this.usuarios.stream()
			.filter(usuarioAux -> usuarioAux.getNombre().equals(unUsuario.getNombre()))
			.findFirst()
			.orElse(null);
			if(usarioHabilitado == null) {
				this.usuarios.add(unUsuario);
				return true;
			}
		
		}
		return false;
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
