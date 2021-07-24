package lesson17_xml_json.json;

import lesson17_xml_json.json.model.Book;
import lesson17_xml_json.json.model.Car;
import lesson17_xml_json.json.model.Comfort;
import lesson17_xml_json.json.model.User;
import lesson17_xml_json.json.util.JsonConverter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class App {

    private static final List<Car> cars = List.of(
            new Car("yellow", "renault", Comfort.COMPACT),
            new Car("green", "porsche", Comfort.LUX),
            new Car("red", "bmw", Comfort.SPORT)
    );

    private static final User user = new User(11,"Denis","999","Middle");

    public static void main(String[] args) throws IOException {
        //https://www.baeldung.com/jackson-object-mapper-tutorial
        //https://www.baeldung.com/jackson-annotations
        JsonConverter<Car> carJsonConverter = new JsonConverter<>();
        JsonConverter<User> userJsonConverter = new JsonConverter<>();
        JsonConverter<Book> bookJsonConverter = new JsonConverter<>();

        Book book = new Book("Basic", LocalDate.of(2020,3,4));

        File carJsonFile = new File("src/main/java/lesson17_xml_json/json/car.json");
        File carJsonArrFile = new File("src/main/java/lesson17_xml_json/json/cars.json");
        File userJsonFile = new File("src/main/java/lesson17_xml_json/json/user.json");

        //String bookJson = bookJsonConverter.convertObjToJson(book);
        //System.out.println(bookJson);

        String carToJson = carJsonConverter.convertObjToJson(carJsonFile,cars.get(0));
        System.out.println(carToJson);

        String carsToJson = carJsonConverter.convertObjArrayToJson(carJsonArrFile,cars);
        System.out.println(carsToJson);

        Car car = carJsonConverter.convertJsonToObj(carToJson,Car.class);
        System.out.println(car);

        Car carFromJsonFile = carJsonConverter.convertJsonToObj(carToJson, Car.class);
        System.out.println(carFromJsonFile);

        List<Car> carArray = carJsonConverter.convertJsonToObjArr(carJsonArrFile);
        System.out.println("List of cars:" + carArray);

        String color = carJsonConverter.getObjJsonNode(carToJson, "color");
        System.out.println(color);

        Map<String, Object> carMapFromJson = carJsonConverter.convertJsonToMap(carJsonFile);
        System.out.println(carMapFromJson);

        String userToJson = userJsonConverter.convertObjToJsonWithRoot(userJsonFile,user);
        System.out.println(userToJson);

    }
}
