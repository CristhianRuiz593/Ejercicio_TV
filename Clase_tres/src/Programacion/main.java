package Programacion;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor tv1;
		tv1=new Televisor ();
		tv1.encender();
			tv1.suborvolumen();
			tv1.suborvolumen();
			tv1.suborvolumen();
			tv1.cambiarCanalArriba();
			tv1.cambiarCanalArriba();
			tv1.cambiarCanalArriba();

		System.out.println("tv1 volumen:"+tv1.obtenervolumen());
		System.out.println("tv1 canal:"+tv1.obtenercanal());




		Televisor tv2=new Televisor();
		tv2.encender();
		tv2.establecervolumen(89);
		tv2.establecercanal(50);
		System.out.println("tv2 volumen:"+tv2.obtenervolumen());
		System.out.println("tv2 canal:"+tv2.obtenercanal());


		Televisor tv3=tv2;
		tv3.suborvolumen();
		tv3.suborvolumen();
		System.out.println("tv2 volumen:"+tv2.obtenervolumen());
		System.out.println("tv3 canal:"+tv3.obtenervolumen());
		}
		}
