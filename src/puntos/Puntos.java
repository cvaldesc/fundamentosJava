package puntos;

import sun.net.www.content.text.plain;

public class Puntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new crea un espacio en memoria
		Puntos2D p1 = new Puntos2D();
		Puntos2D p2 = new Puntos2D(1,3);
		Puntos2D p3 = new Puntos2D(4,2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println("modulo de p1 "+ p1.toString() +" : "+p1.modulo());
		System.out.println("modulo de p2 "+ p2.toString() +" : "+p2.modulo());
		System.out.println("modulo de p3 "+ p3.toString() +" : "+p3.modulo());
	}

}
