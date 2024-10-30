public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String nameStudent, String surnameStudent) {
        super(nameStudent, surnameStudent);
        trick = randomAspect();
        determination = randomAspect();
        ambition = randomAspect();
        resourcefulness = randomAspect();
        thirstForPower = randomAspect();
    }

    public void compareStudentsOnFacultative(Slytherin student) {
        if (sumAllSkillsOfFacultative() > student.sumAllSkillsOfFacultative()) {
            System.out.println(getNameStudent() + " Лучший пуффендуевец чем " +
                    student.getNameStudent());
        } else if (sumAllSkillsOfFacultative() == student.sumAllSkillsOfFacultative()) {
            System.out.println(getNameStudent() + " и " + student.getNameStudent() + " одиноково хороши");
        } else {
            System.out.println(student.getNameStudent() + " Лучший пуффендуевуц чем " +
                    getNameStudent());
        }
    }

    public int sumAllSkillsOfFacultative() {
        return trick + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "nameStudent='" + getNameStudent() + '\'' +
                ", surnameStudent='" + getSurnameStudent() + '\'' +
                ", powerMagic=" + getPowerMagic() +
                ", transgenerate=" + getTransgenerate() +
                "} Slytherin{" +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
}
