package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by enok on 13/06/2018
 */
//@Configuration
public class ChuckConfiguration {

    //    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
