package guru.springframework.services;

/**
 * Created by enok on 12/06/2018
 */
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepositoy greetingRepositoy;

    public PrimaryGreetingService(GreetingRepositoy greetingRepositoy) {
        this.greetingRepositoy = greetingRepositoy;
    }

    @Override
    public String sayGreeting() {
        return greetingRepositoy.getEnglishGreeting();
    }
}
