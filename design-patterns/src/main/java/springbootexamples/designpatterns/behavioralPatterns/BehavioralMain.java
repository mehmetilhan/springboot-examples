package springbootexamples.designpatterns.behavioralPatterns;

/**
 * @author mehmet
 */
public class BehavioralMain {
    public static void main(String[] args) {

        /**
         * State Pattern Example
         */
        Log log = new Log();
        log.save();
        log.changeDestination(new FileLog());
        log.save();

    }
}
