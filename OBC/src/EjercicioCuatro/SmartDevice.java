package EjercicioCuatro;

public class SmartDevice {

	private int pantalla;
	private int botones;
	private int EntradaUsb;
	private int controlRemoto;

	private boolean wifi;
	private boolean hdmi;
	private boolean auriculares;

	private String tamaño;
	private String Os = " ";
	private String cargador;
	private String color;
	private String marca;
	private String garantia;

	public SmartDevice() {

	}

	public SmartDevice(int pantalla, int botones, int entradaUsb, int controlRemoto, boolean wifi, boolean hdmi,
			boolean auriculares, String tamaño, String os, String cargador, String color, String marca,
			String garantia) {
		super();
		this.pantalla = pantalla;
		this.botones = botones;
		EntradaUsb = entradaUsb;
		this.controlRemoto = controlRemoto;
		this.wifi = wifi;
		this.hdmi = hdmi;
		this.auriculares = auriculares;
		this.tamaño = tamaño;
		Os = os;
		this.cargador = cargador;
		this.color = color;
		this.marca = marca;
		this.garantia = garantia;
	}

	public String getOs() {
		return Os;
	}

	public void setOs(String os) {
		Os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	@Override
	public String toString() {
		return "SmartDevice [pantalla=" + pantalla + ", botones=" + botones + ", EntradaUsb=" + EntradaUsb
				+ ", controlRemoto=" + controlRemoto + ", wifi=" + wifi + ", hdmi=" + hdmi + ", auriculares="
				+ auriculares + ", tamaño=" + tamaño + ", Os=" + Os + ", cargador=" + cargador + ", color=" + color
				+ ", marca=" + marca + ", garantia=" + garantia + "]";
	}

}
