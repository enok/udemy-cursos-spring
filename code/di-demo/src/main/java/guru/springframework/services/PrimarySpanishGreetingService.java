package guru.springframework.services;

/**
 * Created by enok on 12/06/2018
 */
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
