package EjercicioCuatro;

public class TestDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartDevice smrt = new SmartDevice(1, 4, 4, 1, true, true, true, "Grande", "Android 13", "Trifasico 220 volts",
				"Negro", "Samchung", "dos años");
		System.out.println("EL equipo que compro contiene las siguientes caracteristicas: " + smrt);

		SmartPhone sphone = new SmartPhone(true, true, true, 180.0, " 4G, 5G", " 6,8” Dynamic AMOLED 2x",
				" 5.000 mAh Carga rápida 25 W", 1, 1, 4.000, 2);
		System.out.println("EL equipo que compro contiene las siguientes caracteristicas: " + sphone);

		SmartWatch swatch = new SmartWatch(true, true, true, true, " correa extra de cuero", " Xiomi DCU",
				" resistencia 1 metro de profundidad");
		System.out.println("EL equipo que compro contiene las siguientes caracteristicas: " + swatch);

	}

}
