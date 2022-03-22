package springbootexamples.designpatterns.creationalPatterns;

/**
 * @author mehmet
 */
public class SingletonPattern {
    private static SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance(){
        return singletonPattern;
    }

    public void say() {
        System.out.println("I am a singleton pattern and the only way for a new one from me is getInstance method !");
    }
}
