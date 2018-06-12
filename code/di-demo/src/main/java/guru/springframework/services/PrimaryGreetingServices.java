package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by enok on 12/06/2018
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingServices implements GreetingService {

    private GreetingRepositoy greetingRepositoy;

    public PrimaryGreetingServices(GreetingRepositoy greetingRepositoy) {
        this.greetingRepositoy = greetingRepositoy;
    }

    @Override
    public String sayGreeting() {
        return greetingRepositoy.getEnglishGreeting();
    }
}
