package springbootexamples.designpatterns.creationalPatterns;




/**
 * @author mehmet
 */
public class CreationalMain {

    public static void main(String[] args) {
        /**
         * Singleton patterns example
         */
//        SingletonPattern singletonPattern = SingletonPattern.getInstance();
//        singletonPattern.say();


        /**
         * Factory Pattern example
         */
//        IHuman human = FactoryPattern.createHuman(HumanType.ENGLISH);
//        human.say();

        /**
         * Builder Pattern example
         */
        Person person = new Person.Builder().name("mehmet").build();

        System.out.println(person.getName() + " " + person.getSurname());

    }

}
