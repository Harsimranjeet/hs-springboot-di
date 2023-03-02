package learn.springframework.sfgdi.services;

import learn.springframework.sfgdi.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository){
        this.englishGreetingRepository = englishGreetingRepository;
    }
    @Override
    public String sayGreetings() {
        return "Hello World----EN";
    }
}
