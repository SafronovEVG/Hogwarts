import java.util.Random;

public class Hogwarts {
    private String nameStudent;
    private String surnameStudent;
    private int powerMagic;
    private int transgenerate;

    public Hogwarts(String nameStudent, String surnameStudent) {
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
        this.powerMagic = randomAspect();
        this.transgenerate = randomAspect();
    }

    public void compareStudentOnHogwarts(Hogwarts student) {
        if (this.sumSkillsOfHogwarts()>student.sumSkillsOfHogwarts()) {
            System.out.println(this.getNameStudent()+" обладает большей мощностью магии, чем "
            +student.getNameStudent());
        }else {
            System.out.println(student.getNameStudent()+" обладает большей мощностью магии, чем "
                    +this.getNameStudent());
        }
    }

    public int sumSkillsOfHogwarts() {
        return getPowerMagic() + getTransgenerate();
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "nameStudent='" + nameStudent + '\'' +
                ", surnameStudent='" + surnameStudent + '\'' +
                ", powerMagic=" + powerMagic +
                ", transgenerate=" + transgenerate;
    }

    public int randomAspect() {
        return new Random().nextInt(100);
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setTransgenerate(int transgenerate) {
        this.transgenerate = transgenerate;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgenerate() {
        return transgenerate;
    }
}
