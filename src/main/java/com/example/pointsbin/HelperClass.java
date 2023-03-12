package com.example.pointsbin;

import com.google.firebase.database.PropertyName;

class HelperClass {
    @PropertyName("name")
    public String name;
    @PropertyName("email")
    public String email;
    @PropertyName("username")
    public String username;
    @PropertyName("password")
    public String password;
    public HelperClass(String name, String email, String username, String password) {
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
    }
}
