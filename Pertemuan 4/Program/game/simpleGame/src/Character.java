public interface Character {
    int MAX_HP = 1000;
    int MIN_HP = 0;

    int launchAttack();
    void gotDamaged(int damage);
    boolean isDied();
}