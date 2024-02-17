package homework.userCore.impl;

import homework.userCore.IUser;
import homework.userCore.Persister;

public class PersisterConsole implements Persister {
    private final IUser user;

    public PersisterConsole(IUser user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
