package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN","default"})
@Service("I18N")
public class I18nEnglish implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
