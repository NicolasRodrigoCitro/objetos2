package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleAdapter extends VoorheesExporter {

	public String exportar(List<Socio> socios) {
		JSONArray arrayJsonString = new JSONArray();
		socios.stream().forEach(s -> arrayJsonString.add(this.exportarSocio(s)));

		return arrayJsonString.toJSONString();
	}

	private String exportarSocio(Socio socio) {
		JSONObject objetoJson = new JSONObject();
		objetoJson.put("nombre", socio.getNombre());
		objetoJson.put("legajo", socio.getLegajo());
		objetoJson.put("email", socio.getEmail());
		return objetoJson.toString();
	}
	
}
