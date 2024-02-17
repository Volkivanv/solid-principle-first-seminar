package homework.userCore;

import homework.userCore.impl.PersisterConsole;
import homework.userCore.impl.ReporterConsole;
import homework.userCore.impl.User;

public class UserRunner {
    IUser user;
    public UserRunner(IUser user){
        this.user = user;
    }
    public void run(){
        Reporter reporter = new ReporterConsole(user);
        reporter.report();
        Persister persister = new PersisterConsole(user);
        persister.save();
    }
}
