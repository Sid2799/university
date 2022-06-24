package university.university.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	private int id;
	private String name;
	private int tclg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTclg() {
		return tclg;
	}
	public void setTclg(int tclg) {
		this.tclg = tclg;
	}
	public University(int id, String name, int tclg) {
		super();
		this.id = id;
		this.name = name;
		this.tclg = tclg;
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
