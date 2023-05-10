public class inheritance {
    public static void main(String[] args) {
//     Fish shark = new Fish();
//     shark.eat();
//        multilevel inheritance
        dogs dobby = new dogs();
        dobby.breed = "german shefard";
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.breed);
        System.out.println(dobby.legs);
    }
}
// parent class or base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class
//class Fish extends Animal{
//    int fins;
//}
class Mammal extends Animal{
    int legs;
}

class dogs extends Mammal{
    String breed;
}
