package EjercicioCuatro;

public class SmartWatch extends SmartDevice {
	private boolean controlTemperaturaCorporal;
	private boolean monitorFrecuencia;
	private boolean recibeNotificaciones;
	private boolean recibellamadas;

	private String correa;
	private String modelo;
	private String resistencialAgua;

	public SmartWatch() {

	}

	public SmartWatch(boolean controlTemperaturaCorporal, boolean monitorFrecuencia, boolean recibeNotificaciones,
			boolean recibellamadas, String correa, String modelo, String resistencialAgua) {
		super();
		this.controlTemperaturaCorporal = controlTemperaturaCorporal;
		this.monitorFrecuencia = monitorFrecuencia;
		this.recibeNotificaciones = recibeNotificaciones;
		this.recibellamadas = recibellamadas;
		this.correa = correa;
		this.modelo = modelo;
		this.resistencialAgua = resistencialAgua;
	}

	public boolean isControlTemperaturaCorporal() {
		return controlTemperaturaCorporal;
	}

	public void setControlTemperaturaCorporal(boolean controlTemperaturaCorporal) {
		this.controlTemperaturaCorporal = controlTemperaturaCorporal;
	}

	public boolean isMonitorFrecuencia() {
		return monitorFrecuencia;
	}

	public void setMonitorFrecuencia(boolean monitorFrecuencia) {
		this.monitorFrecuencia = monitorFrecuencia;
	}

	public boolean isRecibeNotificaciones() {
		return recibeNotificaciones;
	}

	public void setRecibeNotificaciones(boolean recibeNotificaciones) {
		this.recibeNotificaciones = recibeNotificaciones;
	}

	public boolean isRecibellamadas() {
		return recibellamadas;
	}

	public void setRecibellamadas(boolean recibellamadas) {
		this.recibellamadas = recibellamadas;
	}

	public String getCorrea() {
		return correa;
	}

	public void setCorrea(String correa) {
		this.correa = correa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getResistencialAgua() {
		return resistencialAgua;
	}

	public void setResistencialAgua(String resistencialAgua) {
		this.resistencialAgua = resistencialAgua;
	}

	@Override
	public String toString() {
		return "SmartWatch [controlTemperaturaCorporal=" + controlTemperaturaCorporal + ", monitorFrecuencia="
				+ monitorFrecuencia + ", recibeNotificaciones=" + recibeNotificaciones + ", recibellamadas="
				+ recibellamadas + ", correa=" + correa + ", modelo=" + modelo + ", resistencialAgua="
				+ resistencialAgua + "]";
	}

}
