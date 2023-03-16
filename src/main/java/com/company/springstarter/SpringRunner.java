package com.company.springstarter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("myBean", RockMusic.class);

        MusicPlayer player = new MusicPlayer(music);
        System.out.println(player.getMusic());

        context.close();
    }
}