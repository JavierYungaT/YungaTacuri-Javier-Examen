package ec.edu.ups.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Ticket {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int numero;
	private String fechaIngreso;
	private String horaIngreso;
	private String fechaSalida;
	private String horaSalida;
	
	@OneToOne
	@JoinColumn
	private Vehiculo vehiculo;
	
	
	public Ticket() {

	}


	public Ticket(int numero, String fechaIngreso, String horaIngreso, String fechaSalida, String horaSalida,
			Vehiculo vehiculo) {
		super();
		this.numero = numero;
		this.fechaIngreso = fechaIngreso;
		this.horaIngreso = horaIngreso;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.vehiculo = vehiculo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public String getHoraIngreso() {
		return horaIngreso;
	}


	public void setHoraIngreso(String horaIngreso) {
		this.horaIngreso = horaIngreso;
	}


	public String getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public String getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
		result = prime * result + ((fechaSalida == null) ? 0 : fechaSalida.hashCode());
		result = prime * result + ((horaIngreso == null) ? 0 : horaIngreso.hashCode());
		result = prime * result + ((horaSalida == null) ? 0 : horaSalida.hashCode());
		result = prime * result + numero;
		result = prime * result + ((vehiculo == null) ? 0 : vehiculo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (fechaIngreso == null) {
			if (other.fechaIngreso != null)
				return false;
		} else if (!fechaIngreso.equals(other.fechaIngreso))
			return false;
		if (fechaSalida == null) {
			if (other.fechaSalida != null)
				return false;
		} else if (!fechaSalida.equals(other.fechaSalida))
			return false;
		if (horaIngreso == null) {
			if (other.horaIngreso != null)
				return false;
		} else if (!horaIngreso.equals(other.horaIngreso))
			return false;
		if (horaSalida == null) {
			if (other.horaSalida != null)
				return false;
		} else if (!horaSalida.equals(other.horaSalida))
			return false;
		if (numero != other.numero)
			return false;
		if (vehiculo == null) {
			if (other.vehiculo != null)
				return false;
		} else if (!vehiculo.equals(other.vehiculo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso
				+ ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", vehiculo=" + vehiculo + "]";
	}
	
	
	
	

}
