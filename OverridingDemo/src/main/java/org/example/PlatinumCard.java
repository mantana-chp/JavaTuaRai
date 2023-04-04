package org.example;

public class PlatinumCard extends MemberCard{
    //annotation
    @Override
    public float discount(float amount) {
        return amount * .05f;
//        return super.discount(amount); //บรรทัดนี้คือ default | super มองหา method จาก class แม่(MemberCard)
    }

    @Override
    public float rewardXPoint() {
        return 3f;
    }

}
