package luobin.bean;

import java.sql.Date;

/**
 * 
 * @Description: 用于CustomerForQuery 的类，用来存储id\name\email\data 的四个属性，将属性集合化的思想 ,下面就是一个完整的java bean  
 * @author:    ShuaiShuaiDE
 * @date:   2019年11月1日 下午3:47:49
 */
public class Customer {
/**
 * ORM的编程思想(Object relational mapping) 对象关系映射，
 * 让一个数据表对应一个JAVA类
 * 表中的一个字段对应java类的一个属性
 * 
 * 
 * 
 */
	private int id;
	private String name;
	private String email;
	private Date birth;
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, String email, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birth = birth;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", birth=" + birth + "]";
	}
	
	
	
	
	
	
}
