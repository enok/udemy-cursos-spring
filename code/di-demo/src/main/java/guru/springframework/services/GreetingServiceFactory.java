package guru.springframework.services;

/**
 * Created by enok on 13/06/2018
 */
public class GreetingServiceFactory {

    private GreetingRepositoy greetingRepositoy;

    public GreetingServiceFactory(GreetingRepositoy greetingRepositoy) {
        this.greetingRepositoy = greetingRepositoy;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepositoy);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepositoy);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepositoy);
            default:
                return new PrimaryGreetingService(greetingRepositoy);
        }
    }
}
