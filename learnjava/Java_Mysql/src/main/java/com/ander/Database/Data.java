package com.ander.Database;

public enum  Data {

    URL("jdbc:mysql://localhost:3306/mensajes_db?serverTimeZone=UTC"),
    USER("root"),
    PASSWORD("");

    private final String data;

    private Data(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }

}
