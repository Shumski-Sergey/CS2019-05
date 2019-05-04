package sshumsky.lesson6.service;

import sshumsky.lesson6.model.Dog;

public class DogService {

    /**
     * Fight too dogs with parameters
     *
     * @param dog      first dog object
     * @param otherDog second dog
     */
    public void win(Dog dog, Dog otherDog) {
        double thisDog = calculateChanceDog(dog);
        double otherDogResult = calculateChanceDog(otherDog);
        if (thisDog > otherDogResult) {
            getPrintln(dog);
        } else {
            getPrintln(otherDog);
        }
    }

    private void getPrintln(Dog dog) {
        System.out.println(dog.getName());
    }

    private double calculateChanceDog(Dog dog) {
        return 0.2 * dog.getAge() + 0.3 * dog.getWeight() + 0.5 * dog.getPower();
    }
}
