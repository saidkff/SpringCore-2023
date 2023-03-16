package com.company.springstarter;

public class MusicPlayer {
    private Music music;
    //Inversion of Control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String getMusic() {
        return music.getSong();
    }
}
