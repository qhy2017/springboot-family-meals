package qhy.example.web.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JackSonConfig {
    
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
