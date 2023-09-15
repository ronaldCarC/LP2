package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipos")
public class Tipo {
	@Id
	private int idtipo;
	private String descripcion;
	

	
	@Override
	public String toString() {
		return "Tipo [idtipo=" + idtipo + ", descripcion=" + descripcion + "]";
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
