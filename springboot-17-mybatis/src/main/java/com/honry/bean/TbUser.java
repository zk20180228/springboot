package com.honry.bean;


import java.io.Serializable;
import java.sql.Timestamp;

public class TbUser implements Serializable{

  private static final long serialVersionUID = 2777172679882247127L;
  private long id;
  private String username;
  private String password;
  private String phone;
  private String email;
  private Timestamp created;
  private Timestamp updated;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public java.sql.Timestamp getCreated() {
    return created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }


  public java.sql.Timestamp getUpdated() {
    return updated;
  }

  public void setUpdated(java.sql.Timestamp updated) {
    this.updated = updated;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", created=" + created +
            ", updated=" + updated +
            '}';
  }
}
