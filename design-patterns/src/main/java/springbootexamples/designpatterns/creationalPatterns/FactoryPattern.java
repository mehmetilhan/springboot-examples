package springbootexamples.designpatterns.creationalPatterns;

/**
 * @author mehmet
 */

enum HumanType {
    ENGLISH,TURKISH
}

interface IHuman {
    void say();
}

class Turkish implements IHuman {

    @Override
    public void say() {
        System.out.println("I am a Turkish!");
    }
}

class English implements IHuman {

    @Override
    public void say() {
        System.out.println("I am a English!");
    }
}

public class FactoryPattern {
    public static IHuman createHuman(HumanType humanType) {
        switch (humanType) {
            case TURKISH:
                return new Turkish();
            case ENGLISH:
                return new English();
            default:
                return null;
        }
    }
}
