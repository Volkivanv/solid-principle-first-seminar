package homework.userCore.impl;

import homework.userCore.IUser;

public class User implements IUser {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
