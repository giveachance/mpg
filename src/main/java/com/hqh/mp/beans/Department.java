package com.hqh.mp.beans;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hqh
 * @since 2018-08-31
 */
@TableName("tbl_department")
public class Department extends Model<Department> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "dept_id", type = IdType.AUTO)
    private Integer deptId;
    private String departmentName;


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    protected Serializable pkVal() {
        return this.deptId;
    }

    @Override
    public String toString() {
        return "Department{" +
        ", deptId=" + deptId +
        ", departmentName=" + departmentName +
        "}";
    }
}
