package project_spsgame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author kunal dubey
 */

public class Project_SPSgame {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Stone_Paper_Scissor_game example = context.getBean(Stone_Paper_Scissor_game.class);
        example.game();
    }
}
