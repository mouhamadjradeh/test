package me.ideatolife.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
   /* @Bean
    CommandLineRunner commandLineRunner (UserRepository repository){
        return args -> {AppUser testarg = new AppUser(1L,"te","doudi",
                "jradeh","eet@df","ersf","left",
                "nj",true,"ll","sd",
                null,null,
                null,null);

            AppUser testarg2=new AppUser(2L,"te","doudi",
                    "jradeh2","ee2t@df","ersf","left",
                    "nj",true,"ll","sd",
                    null,null,
                    null,null);
            repository.saveAll(List.of(testarg,testarg2));

        };
    }

    */
}
