// Classe pour représenter un développeur

class Developer extends Employee implements BonusRecipient {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void giveBonus(double bonusAmount) {
        System.out.println(getName() + " reçoit une prime de " + bonusAmount);
    }
}