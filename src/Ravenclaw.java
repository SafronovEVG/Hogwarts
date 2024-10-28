public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String nameStudent, String surnameStudent) {
        super(nameStudent, surnameStudent);
        this.mind = randomAspect();
        this.wisdom = randomAspect();
        this.wit = randomAspect();
        this.creativity = randomAspect();
    }

    public void compareStudentsOnFacultative(Ravenclaw student) {
        if (this.sumAllSkillsOfFacultative() > student.sumAllSkillsOfFacultative()) {
            System.out.println(this.getNameStudent() + " Лучший когтеврановец чем " +
                    student.getNameStudent());
        } else {
            System.out.println(student.getNameStudent() + " Лучший когтеврановец чем " +
                    this.getNameStudent());
        }
    }

    public int sumAllSkillsOfFacultative() {
        return getWit() + getWisdom() + getMind() + getWit();
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "nameStudent='" + getNameStudent() + '\'' +
                ", surnameStudent='" + getSurnameStudent() + '\'' +
                ", powerMagic=" + getPowerMagic() +
                ", transgenerate=" + getTransgenerate() +
                "} Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}