package learn.springframework.sfgdi.services;
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World----Property";
    }
}
