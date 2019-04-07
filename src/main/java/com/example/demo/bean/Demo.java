package com.example.demo.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Demo {
	private int id;
	private String name;
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date createtime;
	@JSONField(serialize=false)
	private String remarks;

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

}
