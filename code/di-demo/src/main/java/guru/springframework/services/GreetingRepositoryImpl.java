package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * Created by enok on 12/06/2018
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepositoy {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primäre Grußdienst";
    }
}
