package org.formacion.decorator;

import java.util.ArrayList;
import java.util.List;

public class BaseDatosMemoria implements BaseDatos{
	private final List<String> valores = new ArrayList<>();
	@Override
	public void inserta(String registro) {
		// TODO Auto-generated method stub
		valores.add(registro);
	}

	@Override
	public List<String> registros() {
		// TODO Auto-generated method stub
		return new ArrayList<>(valores);
	}

}
