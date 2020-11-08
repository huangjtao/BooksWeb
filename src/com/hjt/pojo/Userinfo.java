package com.hjt.pojo;

 //和数据库表admininfo对应的java实体类
public class Userinfo {
     private int id;
     private String username;
     private String password;
     private String picurl;
     private String email;

     //无参 全参 getset toString


     public Userinfo() {
     }

     public Userinfo(int id, String username, String password, String picurl, String email) {
         this.id = id;
         this.username = username;
         this.password = password;
         this.picurl = picurl;
         this.email = email;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
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

     public String getPicurl() {
         return picurl;
     }

     public void setPicurl(String picurl) {
         this.picurl = picurl;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     @Override
     public String toString() {
         return "Userinfo{" +
                 "id=" + id +
                 ", username='" + username + '\'' +
                 ", password='" + password + '\'' +
                 ", picurl='" + picurl + '\'' +
                 ", email='" + email + '\'' +
                 '}';
     }

 }
