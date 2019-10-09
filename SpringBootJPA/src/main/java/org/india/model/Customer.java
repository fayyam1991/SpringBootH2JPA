package org.india.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int cid;
	private String name;
	private String tech;

	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the tech
	 */
	public String getTech() {
		return tech;
	}

	/**
	 * @param tech the tech to set
	 */
	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", tech=" + tech + "]";
	}

}
