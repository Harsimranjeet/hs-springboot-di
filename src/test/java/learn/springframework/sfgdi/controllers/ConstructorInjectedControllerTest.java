package learn.springframework.sfgdi.controllers;

import learn.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreetings() {
        constructorInjectedController.getGreetings();
    }
}