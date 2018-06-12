package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by enok on 12/06/2018
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primäre Grußdienst";
    }
}
