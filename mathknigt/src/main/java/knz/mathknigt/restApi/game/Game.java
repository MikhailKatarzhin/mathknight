package knz.mathknigt.restApi.game;

import knz.mathknigt.database.model.User;

public class Game {
    User    userLeft;
    User    userRight;
    Knight  knightLeft;
    Knight  knightRight;
    boolean roundIsLeft;
    long    potential;

    public Game(Long potential){
        roundIsLeft     = true;
        this.userLeft   = null;
        this.userRight  = null;
        this.potential  = potential;
    }

    public void join(User newUser){
        if (userLeft == null)
            userLeft = newUser;
        else
        if (userRight == null)
            userRight = newUser;
    }

    public void leave(User user){
        if (user == userLeft)
            userLeft    = null;
        if (user == userRight)
            userRight   = null;
    }
}
