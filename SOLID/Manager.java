// Classe pour représenter un manager

class Manager extends Employee implements BonusRecipient {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void giveBonus(double bonusAmount) {
        System.out.println(getName() + " reçoit une prime de " + bonusAmount);
    }
}