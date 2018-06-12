package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by enok on 12/06/2018
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepositoy greetingRepositoy;

    public PrimarySpanishGreetingService(GreetingRepositoy greetingRepositoy) {
        this.greetingRepositoy = greetingRepositoy;
    }

    @Override
    public String sayGreeting() {
        return greetingRepositoy.getSpanishGreeting();
    }
}
