package springbootexamples.designpatterns.creationalPatterns;

/**
 * @author mehmet
 */

class Person {
    private String name, surname, address;

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {

        private String name, surname, address;

        public Builder(){ }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }


    }
}


