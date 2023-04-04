package org.example;

public class GoldCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return super.discount(amount);
    }

    @Override
    public float rewardXPoint() {
        return 2f;
    }
}
