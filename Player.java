public class Player implements Comparable<Player> {

    /**
     * The health of the player.
     */
    private int health;

    /**
     * The power level of the player.
     */
    private int power;

    /**
     * Constructs a player with a random health value between 1 and 100 and a
     * random power level between 1 and 25
     */
    public Player() {
        this.health = (int) (Math.random() * 100 + 1);
        this.power = (int) (Math.random() * 25 + 1);
    }

    /**
     * Returns the health of the player.
     *
     * @returns player health.
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Returns the power level of the player.
     *
     * @returns player power level.
     */
    public int getPower() {
        return this.power;
    }

    /**
     * Should compare the health of two players.
     *
     * @returns negative number if the other player has more health, 0 if the
     * same health, and a positive number if this player has more health.
     */
    @Override
    public int compareTo(Player o) {
        return this.power - o.getPower();
    }

    @Override
    public String toString() {
        return "Player{health=" + this.health + ", power=" + this.power + "}";
    }

}
