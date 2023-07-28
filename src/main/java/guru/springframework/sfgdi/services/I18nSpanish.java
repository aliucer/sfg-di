package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("SP")
@Service("I18N")
public class I18nSpanish implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hola Mundo - ES";
    }
}
