package com.tienmonkey.cuoiky.Module;

public class Users {
    private String name, phone, password, address, admin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Users(String name, String password, String phone, String address, String admin) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.admin = admin;
    }

    public Users() {
    }
}
