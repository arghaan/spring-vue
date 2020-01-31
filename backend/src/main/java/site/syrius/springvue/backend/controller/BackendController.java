package site.syrius.springvue.backend.controller;

import org.springframework.web.bind.annotation.*;
import site.syrius.springvue.backend.jpa.Person;
import site.syrius.springvue.backend.model.Greeting;
import site.syrius.springvue.backend.repository.PersonRepository;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class BackendController {
    private final AtomicLong counter = new AtomicLong();

    private final PersonRepository personRepository;

    public BackendController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "World", name = "name") String name) {
        return new Greeting(counter.incrementAndGet(), "Hello, " + name);
    }

    @GetMapping("/persons")
    public Iterable<Person> getPerson() {
        return personRepository.findAll();
    }
}
