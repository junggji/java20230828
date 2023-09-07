package ch13generic.lecture;


public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 =d;
        Cat c = new Cat();
        Animal a2 =c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1; // X
//        o2.set(new Animal());

        MyClass06<? extends Animal> o3 = o1; // Animal 또는 그 하위타입인 경우 가능
        MyClass06<? extends Animal> o6 = new MyClass06<Animal>(); // Animal 또는 그 하위타입인 경우 가능
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();
        MyClass06<? extends Animal> o8 = new MyClass06<Cat>();
//        MyClass06<? extends Animal> o5 = new MyClass06<Object>(); // X 상위타입은 안됨
        Animal ani1 = o3.get();     // 형변환 없이 쓸수있음-- extends는  get은 안전 set은 위험
//        o3.set(new Dog()); // X Cat일 경우도 있기 때문    // Animal is Dog은 아니니까!
        ani1.animalMethod();

        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();
//        MyClass06<? super Animal> o10 = new MyClass06<Dog>();// x
        o4.set(new Dog());  // Dog is Animal 이 되니까
        o5.set(new Cat());  // Dog is Animal 이 되니까
        o4.set(new Animal());  // Dog is Animal 이 되니까  ---- super는  set은 안전 get은 위험
    }
}

class Animal {
    public void animalMethod() {

    }
}
class Dog extends Animal {}
class Cat extends Animal {}

class MyClass06<T> {
    public void set(T param) {}
    public T get() {
        return null;
    }
}