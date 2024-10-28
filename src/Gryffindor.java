public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String nameStudent, String surnameStudent) {
        super(nameStudent, surnameStudent);
        this.bravery = randomAspect();
        this.honor = randomAspect();
        this.bravery = randomAspect();
    }

    public void compareStudentsOnFacultative(Gryffindor student) {
        if (this.sumAllSkillsOfFacultative() > student.sumAllSkillsOfFacultative()) {
            System.out.println(this.getNameStudent() + " Лучший грифиндоровец чем " +
                    student.getNameStudent());
        }
        if (this.sumAllSkillsOfFacultative() == student.sumAllSkillsOfFacultative()) {
            System.out.println(this.getNameStudent() + " и " + student.getNameStudent() + " одиноково хороши");
        } else {
            System.out.println(student.getNameStudent() + " Лучший грифиндоровец чем " +
                    this.getNameStudent());
        }
    }

    public int sumAllSkillsOfFacultative() {
        return getHonor() + getBravery() + getNobility();
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "nameStudent='" + getNameStudent() + '\'' +
                ", surnameStudent='" + getSurnameStudent() + '\'' +
                ", powerMagic=" + getPowerMagic() +
                ", transgenerate=" + getTransgenerate() +
                "} Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
