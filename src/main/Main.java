package main;

import sdk.Game;
import sdk.Logic;
import sdk.User;

import java.io.*;

/**
 * Created by BenjaminSelnaes on 15/10/15.
 */
public class Main {

    public static void main(String args[]) throws IOException {

        User user = new User();
        Game game1 = new Game();
        Game game2 = new Game();

        user.setFirstName("");
        user.setLastName("");
        user.setUsername("");
        user.setPassword("");
        user.setEmail("");
        user.setStatus("");
        user.setType("");

        /*game1.setHost(user);
        game1.setName("Diablo");
        game1.setStatus(1);
        //game.setCreated();
        game1.setHostControls("dsaw");
        game1.setOpponent(user);
        game1.setOpponentControls("sadaws");

        game2.setGameId(2);
        game2.setHost(user);
        game2.setName("Emilergrem");
        game2.setStatus(1);
        //game.setCreated();
        game2.setHostControls("asddass");
        game2.setOpponent(user);
        game2.setOpponentControls("aawwssdd");*/

        Logic.login("doek4life", "abc123");
        Logic.createGame(game1);
        Logic.createUser(user);
        Logic.getGame(1);
        Logic.getGame(2);


    }
}
