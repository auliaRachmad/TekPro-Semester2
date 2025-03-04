abstract class Role {
    protected int defensePoint;
    protected int attackPoint;
    protected int weaponPower;
    protected int equipmentPower;
    protected int hitPoint;
    protected String nama;

    public Role (String eNama, int eHitPoint, int eDefensePoint, int eAttackPoint, int eWeaponPower, int eEquipmentPower){
        nama = eNama;
        hitPoint = eHitPoint;
        defensePoint = eDefensePoint;
        attackPoint = eDefensePoint;
        weaponPower = eWeaponPower;
        equipmentPower = eEquipmentPower;
    }

    public String toString(){
        String result = "Nama: " + nama + "\n";
        result += "Hitpoint: " + hitPoint + "\n";
        result += "Defense: " + defensePoint + "\n";
        result += "Attack: " + attackPoint + "\n";
        result += "Wep: " + weaponPower + "\n";
        result += "Eq: " + equipmentPower;

        return result;
    }

    public abstract int powerTotal();
}
