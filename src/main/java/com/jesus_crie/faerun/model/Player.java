package com.jesus_crie.faerun.model;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Player implements Comparable<Player> {

    public enum Side {
        LEFT, RIGHT
    }

    private final String pseudo;
    private final Side side;
    private int score = 0;

    /**
     * @param pseudo - The username of the player.
     */
    public Player(@Nonnull final String pseudo,
                  @Nonnull final Side side) {
        this.pseudo = pseudo;
        this.side = side;
    }

    /**
     * @return The username of the player.
     */
    @Nonnull
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @return The side of the player on the board.
     */
    @Nonnull
    public Side getSide() {
        return side;
    }

    /**
     * @return The current score of the player.
     */
    public int getScore() {
        return score;
    }

    /**
     * Increment the score of the player
     *
     * @param amount - The amount of points to add.
     */
    public void incrementScore(final int amount) {
        score += amount;
    }

    /**
     * 2 players are equals if they have the same username.
     *
     * @param obj - The object to compare with.
     * @return True if the 2 objects are the same player, otherwise false.
     */
    @Override
    public boolean equals(@Nullable final Object obj) {
        return obj instanceof Player && pseudo.equals(((Player) obj).pseudo);
    }

    /**
     * Compare 2 players based on their respective scores.
     *
     * @param player - The other player to compare to.
     * @return A negative value, zero or a positive value wether this object is less than, equal or greater respectively
     * that the other player.
     */
    @Override
    public int compareTo(@Nonnull final Player player) {
        return score - player.score;
    }
}
