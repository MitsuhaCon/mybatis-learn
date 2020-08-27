package com.mitsuha.pojo;

import java.math.BigDecimal;

/**
 * @author yangliming
 * @classname Emp
 * @description //TODO
 * @data 2020/8/27 0:31
 */
public class Emp {
    private Integer empno;
    private String ename;
    private BigDecimal sal;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                '}';
    }
}
