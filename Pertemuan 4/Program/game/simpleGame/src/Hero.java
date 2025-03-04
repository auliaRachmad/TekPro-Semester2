public class Hero extends Role implements Character{

    private int defensePoint;
    private int attackPoint;
    private int weaponPower;
    private int equipmentPower;
    private int hitPoint;
    private int skillPoint;

    public Hero(String eNama, int eDefensePoint, int eAttackPoint, int eWeaponPower, int eEquipmentPower, int eSkillPoint) {
        super(eNama, MAX_HP, eDefensePoint, eAttackPoint, eWeaponPower, eEquipmentPower);
        this.defensePoint = eDefensePoint;
        this.attackPoint = eAttackPoint;
        this.weaponPower = eWeaponPower;
        this.equipmentPower = eEquipmentPower;
        this.hitPoint = MAX_HP;
        this.skillPoint = eSkillPoint;
    }

    @Override
    public int powerTotal() {
        return ((defensePoint*hitPoint) + (attackPoint*hitPoint) + weaponPower + equipmentPower)*skillPoint;
    }

    private void setHitPoint(int hp){
        this.hitPoint = hp;
    }

    private int getHitPoint(){
        return this.hitPoint;
    }

    @Override
    public int launchAttack() {
        return (attackPoint+weaponPower)*skillPoint;
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
