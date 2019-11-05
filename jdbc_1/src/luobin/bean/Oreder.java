package luobin.bean;

import java.sql.Date;

public class Oreder {
	
	private int id;
	private String name;
	private Date date;
	
	public Oreder() {
		super();
	}

	public Oreder(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setNaem(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Oreder [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	
	
}
