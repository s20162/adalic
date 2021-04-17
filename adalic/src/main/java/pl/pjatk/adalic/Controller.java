package pl.pjatk.adalic;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Controller {
    private final Car car;

    public Controller( Car car) {
        this.car = car;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> car() {
        return ResponseEntity.ok(car);
    }
    @GetMapping("/hello/{value}")
    public  ResponseEntity<String> helloValue(@PathVariable String value) {
        return ResponseEntity.ok(value);
    }
    @GetMapping("/param")
    public  ResponseEntity<String> paramvalue(@RequestParam String value) {
        return ResponseEntity.ok(value);
    }

    @PostMapping("/post")
    public ResponseEntity<Car> request(@RequestBody Car car) {

        return ResponseEntity.ok(car);

    }


}
