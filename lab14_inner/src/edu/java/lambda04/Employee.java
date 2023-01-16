package edu.java.lambda04;

public class Employee {

    private Integer empId;// 사번
    private String name;  // 이름
    private String job;   // 직책
    private String dept;  // 부서
    private Integer salary; // 급여
    
    public Employee () {}

    public Integer getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public String getDept() {
        return dept;
    }
    public Integer getSalary() {
        return salary;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(Integer empId, String name, String job, String dept, Integer salary) {
        this.empId = empId;
        this.name = name;
        this.job = job;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("직원 [사번 : %s, 이름 : %s , 직책 : %s, 부서 : %s, 급여 : %s]",empId, name, job, dept, salary);
    }
    
    
  
}
