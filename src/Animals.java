/**
 * Created by lchar on 17.06.2017.
 */
abstract class Animal {
    static int counter = 0;
    public int legs;
    //    String species;
    protected int age;

    Animal(int a) {
        age = a;
        Counter();
    }

    Animal() {
        age = 0;
        Counter();
    }

    static void Counter() {
        counter++;
    }

    public abstract void speak();


    public int getAge() {
        return age;
    }

    public void setAge(int val) {
        age = val;
    }


}

class Dog extends Animal {
    int id;

    Dog() {
        this.age = 0;
        this.legs = 4;

    }

    Dog(int a) {
        this.age = a;
        this.legs = 4;

    }

    public static void bark() {
        System.out.println("Woof-Woof!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void speak() {
        System.out.println("Woof!  ]:->  ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        return getId() == dog.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}


public class Animals {

    public static void main(String[] args) {
        System.out.println(Animal.counter);
        Dog dog = new Dog(10);
        dog.bark();
        System.out.println(dog.age);
        System.out.println(Animal.counter);

        System.out.println(dog.getAge());
        dog.setAge(4);
        System.out.println(dog.getAge());


        dog.speak();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setId(2);

        Dog dog3 = dog2;
        dog3.setId(5);

        System.out.println(dog3.equals(dog2));
        System.out.println(dog3==dog2);
        System.out.println(dog2.id);
        System.out.println(dog3.id);


    }


}