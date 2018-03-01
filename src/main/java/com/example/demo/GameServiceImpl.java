package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bartosz on 2018-02-17.
 */
public class GameServiceImpl implements GameService {

    public List<Game> getGameList() {
        List<Game> games = new ArrayList<Game>();
        Game game = new Game("Catan", 3, 4);
        games.add(game);

        game = new Game("test", 2, 5);
        games.add(game);
        game = new Game("test3", 2, 5);
        games.add(game);
        game = new Game("test", 2, 5);
        games.add(game);
        game = new Game("test3", 2, 5);
        game = new Game("test", 2, 5);
        game = new Game("tes3t", 2, 5);

    }
}
