package com.devsuperior.dscatalog.dto;

public class UserInsertDTO extends UserDTO {

    private String password;

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
