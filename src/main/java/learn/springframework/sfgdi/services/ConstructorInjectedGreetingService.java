package learn.springframework.sfgdi.services;
public class ConstructorInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello World----Constructor";
    }
}
