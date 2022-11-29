package EjercicioCuatro;

public class SmartPhone extends SmartDevice {

	private boolean alarma;
	private boolean microsd;
	private boolean altavoz;

	private double capacidadMemoria;
	private String cuatrog;
	private String pantallaTactil;
	private String duracionBateria;

	private int camara;
	private int funda;

	private int chipEmpresaTelefonica;
	private double ram;

	public SmartPhone() {

	}

	public SmartPhone(boolean alarma, boolean microsd, boolean altavoz, double capacidadMemoria, String cuatrog,
			String pantallaTactil, String duracionBateria, int camara, int funda, double ram,
			int chipEmpresaTelefonica) {
		super();
		this.alarma = alarma;
		this.microsd = microsd;
		this.altavoz = altavoz;
		this.capacidadMemoria = capacidadMemoria;
		this.cuatrog = cuatrog;
		this.pantallaTactil = pantallaTactil;
		this.duracionBateria = duracionBateria;
		this.camara = camara;
		this.funda = funda;
		this.ram = ram;
		this.chipEmpresaTelefonica = chipEmpresaTelefonica;
	}

	public boolean isMicrosd() {
		return microsd;
	}

	public void setMicrosd(boolean microsd) {
		this.microsd = microsd;
	}

	public double getCapacidadMemoria() {
		return capacidadMemoria;
	}

	public void setCapacidadMemoria(double capacidadMemoria) {
		this.capacidadMemoria = capacidadMemoria;
	}

	public String getDuracionBateria() {
		return duracionBateria;
	}

	public void setDuracionBateria(String duracionBateria) {
		this.duracionBateria = duracionBateria;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "SmartPhone [alarma=" + alarma + ", microsd=" + microsd + ", altavoz=" + altavoz + ", capacidadMemoria="
				+ capacidadMemoria + ", cuatrog=" + cuatrog + ", pantallaTactil=" + pantallaTactil
				+ ", duracionBateria=" + duracionBateria + ", camara=" + camara + ", funda=" + funda
				+ ", chipEmpresaTelefonica=" + chipEmpresaTelefonica + ", ram=" + ram + "]";
	}

	
}
