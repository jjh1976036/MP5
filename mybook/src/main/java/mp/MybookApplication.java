package mp;

// import mp.config.kafka.KafkaProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
// import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
@EnableFeignClients
public class MybookApplication {
    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(MybookApplication.class, args);
        System.out.println("✅ Active Profiles: " +
            Arrays.toString(applicationContext.getEnvironment().getActiveProfiles()));
    }
}
