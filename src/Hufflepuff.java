public class Hufflepuff extends Hogwarts {
    private int indusriousness;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String nameStudent, String surnameStudent) {
        super(nameStudent, surnameStudent);
        indusriousness = randomAspect();
        honesty = randomAspect();
        loyalty = randomAspect();
    }

    public void compareStudentsOnFacultative(Hufflepuff student) {
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
        return indusriousness + honesty + loyalty;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "nameStudent='" + getNameStudent() + '\'' +
                ", surnameStudent='" + getSurnameStudent() + '\'' +
                ", powerMagic=" + getPowerMagic() +
                ", transgenerate=" + getTransgenerate() +
                "} Hufflepuff{" +
                "indusriousness=" + indusriousness +
                ", honesty=" + honesty +
                ", loyalty=" + loyalty +
                '}';
    }

    public void setIndusriousness(int indusriousness) {
        this.indusriousness = indusriousness;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getIndusriousness() {
        return indusriousness;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }
}
