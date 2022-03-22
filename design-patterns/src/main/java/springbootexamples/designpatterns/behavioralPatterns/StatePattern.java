package springbootexamples.designpatterns.behavioralPatterns;

/**
 * @author mehmet
 */

interface ILog {
    void save();
}

class DbLog implements ILog {

    @Override
    public void save() {
        System.out.println("Logged to database!");
    }
}

class FileLog implements ILog {

    @Override
    public void save() {
        System.out.println("Logged to file!");
    }
}

class Log {

    private ILog log;

    public Log() {
        this.log = new DbLog();
    }

    void save() {
        log.save();
    }

    void changeDestination(final ILog log) {
        this.log = log;
    }

}

