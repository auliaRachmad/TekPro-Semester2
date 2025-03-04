public class Mage extends Role implements Character{
    private int defensePoint;
    private int attackPoint;
    private int weaponPower;
    private int equipmentPower;
    private int hitPoint;
    private int manaPoint;

    public Mage(String eNama, int eDefensePoint, int eAttackPoint, int eWeaponPower, int eEquipmentPower, int eManaPoint) {
        super(eNama, MAX_HP, eDefensePoint, eAttackPoint, eWeaponPower, eEquipmentPower);
        this.defensePoint = eDefensePoint;
        this.attackPoint = eAttackPoint;
        this.weaponPower = eWeaponPower;
        this.equipmentPower = eEquipmentPower;
        this.hitPoint = MAX_HP;
        this.manaPoint = eManaPoint;
    }

    @Override
    public int powerTotal() {
        return ((defensePoint*hitPoint) + (attackPoint*hitPoint) + weaponPower + equipmentPower)+(manaPoint*hitPoint);
    }

    private void setHitPoint(int hp){
        this.hitPoint = hp;
    }

    private int getHitPoint(){
        return this.hitPoint;
    }

    @Override
    public int launchAttack() {
        return (attackPoint+weaponPower)*manaPoint;
    }

    @Override
    public void gotDamaged(int damage) {
        if(defensePoint*equipmentPower < damage){
            setHitPoint(getHitPoint() - damage/defensePoint);
        }
    }

    @Override
    public boolean isDied() {
        if (getHitPoint() <= MIN_HP){
            return true;
        }else {
            return false;
        }
    }
}
