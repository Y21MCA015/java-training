package serialize;

import java.io.Serializable;

public class Employee implements Serializable {
    public int id;
    public String name;
    public String jobdescription;
    public transient String location;
    public  transient String projectname;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobdescription='" + jobdescription + '\'' +
                ", location='" + location + '\'' +
                ", projectname='" + projectname + '\'' +
                '}';
    }

    public Employee(int id, String name, String jobdescription, String location, String projectname) {
        this.id = id;
        this.name = name;
        this.jobdescription = jobdescription;
        this.location = location;
        this.projectname = projectname;
    }

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

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }
}
