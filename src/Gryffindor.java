public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String nameStudent, String surnameStudent) {
        super(nameStudent, surnameStudent);
        nobility = randomAspect();
        honor = randomAspect();
        bravery = randomAspect();
    }

    public void compareStudentsOnFacultative(Gryffindor student) {
        if (sumAllSkillsOfFacultative() > student.sumAllSkillsOfFacultative()) {
            System.out.println(getNameStudent() + " Лучший грифиндоровец чем " +
                    student.getNameStudent());
        } else if (sumAllSkillsOfFacultative() == student.sumAllSkillsOfFacultative()) {
            System.out.println(getNameStudent() + " и " + student.getNameStudent() + " одиноково хороши");
        } else {
            System.out.println(student.getNameStudent() + " Лучший грифиндоровец чем " +
                    getNameStudent());
        }
    }

    public int sumAllSkillsOfFacultative() {
        return honor + bravery + nobility;
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
