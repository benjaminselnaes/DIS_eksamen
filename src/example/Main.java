package example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        Game game = new Game();

        user.setFirstName("");
        user.setLastName("");
        user.setUsername("");
        user.setPassword("");
        user.setEmail("");
        user.setStatus("");
        user.setType("");

        game.setHost(user);
        game.setName("");
        game.setStatus(1);
        //game.setCreated();
        game.setHostControls("");
        game.setOpponent(user);
        game.setOpponentControls("");

        Logic.login("doek4life", "abc123");
        Logic.createGame(game);
        Logic.createUser(user);


    }
}
