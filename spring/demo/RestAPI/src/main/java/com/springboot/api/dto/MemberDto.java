package com.springboot.api.dto;

public class MemberDto {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEamil() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
        "name=" + name + "\n" + "email=" + email + "}\n";
    }
}
