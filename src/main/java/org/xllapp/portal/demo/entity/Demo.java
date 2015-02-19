package org.xllapp.portal.demo.entity;

import java.util.Date;

import org.xllapp.mvc.entity.IdEntity;

public class Demo extends IdEntity {

	private static final long serialVersionUID = 7940440765339066529L;

	private String name;
    
    private String password;
    
    private String icon;
    
    private Integer status;
    
    private Date createTime;
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}