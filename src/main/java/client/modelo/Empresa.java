package client.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresas")

public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdE")
	private Long idEmpresa;
	
	@Column(name="Nombre_Empresa")
	private String nomEmpresa;
	
	@Column(name="Area")
	private String area;
	
	@Column(name="Cargo")
	private String cargo;
	
	@Column(name="Ciudad")
	private String ciudad;
	
	
	@Column(name="Contacto")
	private String contacto;
	
	@Column(name="Pais")
	private String pais;
	
	@Column(name="Tiempo")
	private String tiempo;
	
	
	
	public Empresa () {
		
	}
	
	
	public Empresa (Long idEmpresa,String nomEmpresa, String area,String cargo, String ciudad, 
			String contacto,String pais, String tiempo) {
		
		this.idEmpresa= idEmpresa;
		this.nomEmpresa= nomEmpresa;
		this.area= area;
		this.cargo=cargo;
		this.ciudad=ciudad;
		this.contacto=contacto;
		this.pais=pais;
		this.tiempo=tiempo;
	}


	public Long getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}


	public String getNomEmpresa() {
		return nomEmpresa;
	}


	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getTiempo() {
		return tiempo;
	}


	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	
	
}
