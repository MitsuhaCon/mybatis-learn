package com.mitsuha.dao;

import com.mitsuha.pojo.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yangliming
 * @classname EmpDao
 * @description //TODO
 * @data 2020/8/27 0:30
 */
public interface EmpDao {
    /**
     * 获取 emp 表中的所有数据
     * @return
     */
    List<Emp> getEmpList();

    /**
     * 通过 enpno 查找用户信息
     * @param empno
     * @return
     */
    Emp getEmpByEmpno(int empno);

    @Select("select * from emp where empno = #{empno}")
    Emp getEmpByAnnotation(int empno);
}
