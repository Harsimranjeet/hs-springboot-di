package learn.springframework.sfgdi.services;
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello World----Setter";
    }
}
