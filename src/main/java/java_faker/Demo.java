package java_faker;

import com.github.javafaker.Faker;

public class Demo {

    public static Faker faker = new Faker();

    public static void main(String[] args) {

        System.out.println(generateFakeFirstName());

        System.out.println(generateFakeLastName());

        System.out.println(generateFakeEmailAddress());

        System.out.println(generateFakeArtistsName());
    }



    public static String generateFakeFirstName(){
        return "Hello, my name is " + faker.name().firstName();
    }

    public static String generateFakeLastName(){
        return "Surname is: " + faker.name().lastName();
    }

    public static String generateFakeEmailAddress(){
        return "Email is " + faker.internet().emailAddress();
    }

    public static String generateFakeArtistsName(){
        return faker.artist().name();
    }



}
