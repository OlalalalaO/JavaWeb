package emp;

import java.util.Date;

public class emp {
    private int id;
    private String name;
    private String gender;
    private int salary;
    private Date joinData;
    private String depid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getJoinData() {
        return joinData;
    }

    public void setJoinData(Date joinData) {
        this.joinData = joinData;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public emp(int id, String name, String gender, int salary, Date joinData, String depid) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.joinData = joinData;
        this.depid = depid;
    }

    public emp() {
    }

    @Override
    public String toString() {
        return "emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", joinData=" + joinData +
                ", depid='" + depid + '\'' +
                '}';
    }
}
