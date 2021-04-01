package june.basic.lab;

// 사원: 사번,이름,성,이메일,전화번호,입사일,직책,급여,수당,상사번호,부서번호
//    empno,fname,lname,email,phone,hdate,jobid,sal,comm,mgrid,deptid
// 기본정보 : 사번,이름,성,이메일,전화번호,입사일
// 추가정보는 난수를 이용해서 자동으로 생성되도록 코드화함 (makeExtInfo)

public class EmployeeV0 {
    protected String empno;
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected String hdate;
    protected String jobid;
    protected int sal;
    protected double comm;
    protected String  mgrid;
    protected String  deptid;

    public EmployeeV0() { }

    public EmployeeV0(String empno, String fname, String lname, String email, String phone, String hdate) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public String getMgrid() {
        return mgrid;
    }

    public void setMgrid(String mgrid) {
        this.mgrid = mgrid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        String fmt = "emp{empno:%s,fname:%s,lname:%s,"+
                "email:%s,phone:%s, hdate:%s,\n" +
                "jobid:%s,sal:%s,comm:%s,"+
                "mgrid:%s,deptid:%s}\n";
        String result = String.format(fmt,empno,fname,lname,email,phone,hdate,jobid,sal,comm,mgrid,deptid);

        return result;
    }
}
