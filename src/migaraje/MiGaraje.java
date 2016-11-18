package migaraje;

public class MiGaraje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array de vehicles
		Vehiculo[] vehiculos = new Vehiculo[5];
		
		Coche c1 = new Coche(Vehiculo.Tipo.COCHE, 5, 400, "lamborgini", "Aventur", "negro", 70, true);
		vehiculos[1] = c1;
		
		Coche c2 = new Coche(Vehiculo.Tipo.COCHE, 2, 600, "ford", "mustang", "gris", 60, false);
		vehiculos[2] = c2;
		
		System.out.println(vehiculos[1]);
	}

}
