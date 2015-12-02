package Programacion;

public class Televisor {
	private int volumen_actual;
	private int canal_actual;
	private boolean encendido;
	public void establecervolumen(int volumen){
		volumen_actual=volumen;
	}
	public void establecercanal(int canal){
		canal_actual=canal;
	}
	public int obtenervolumen(){
		return volumen_actual;
	}
	public int obtenercanal(){
		return canal_actual;
	}
	public void encender(){
		encendido=true;
	}
	public void apagar(){
		encendido= false;
	}

	public void suborvolumen(){
		if(encendido && volumen_actual<=100)
		volumen_actual++;
	}
	public void bajarVolumen(){
		if(encendido && volumen_actual>=0)

		volumen_actual--;
	}
	public void cambiarCanalArriba(){
		if(encendido && canal_actual<=50)
			canal_actual++;
	}
	public void cambiarCanalAbajo(){
		if(encendido && canal_actual>=1)
			canal_actual--;
	}

}
