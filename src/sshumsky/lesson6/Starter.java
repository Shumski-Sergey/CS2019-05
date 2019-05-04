package sshumsky.lesson6;

import sshumsky.lesson6.model.Dog;
import sshumsky.lesson6.service.DogService;

public class Starter {
    public static void main(String[] args) {
        DogService dogService = new DogService();
        Dog dog = new Dog(50, "Sharik", 8, 55.5);
        Dog otherDog = new Dog(45, "Losharik", 9, 50.5);
        dogService.win(dog, otherDog);
    }
}
