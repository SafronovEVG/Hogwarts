public class Hufflepuff extends Hogwarts {
    private int indusriousness;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String nameStudent, String surnameStudent) {
        super(nameStudent, surnameStudent);
        this.indusriousness = randomAspect();
        this.honesty = randomAspect();
        this.loyalty = randomAspect();
    }

    public void compareStudentsOnFacultative(Hufflepuff student) {
        if (this.sumAllSkillsOfFacultative() > student.sumAllSkillsOfFacultative()) {
            System.out.println(this.getNameStudent() + " Лучший пуффендуевец чем " +
                    student.getNameStudent());
        } else {
            System.out.println(student.getNameStudent() + " Лучший пуффендуевуц чем " +
                    this.getNameStudent());
        }
    }

    public int sumAllSkillsOfFacultative() {
        return getHonesty() + getIndusriousness() + getLoyalty();
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
