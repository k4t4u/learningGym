package org.example.robotFights;

public abstract class AbstractRobot implements CanAttack, CanDefend {

    private int hitCount;
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return BodyPart.CHEST;
    }

    public BodyPart defend() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        } else {
            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        }
        return defendedBodyPart;
    }
}
