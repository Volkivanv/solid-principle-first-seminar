package homework.userCore.impl;

import homework.userCore.IUser;
import homework.userCore.Reporter;

public class ReporterConsole implements Reporter {
    private IUser user;
    public ReporterConsole(IUser user){
        this.user = user;
    }
    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
