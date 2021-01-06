package ali;

import java.util.ArrayList;
import java.util.List;

public class Department {

  long departmentId;
  String departmentName;
  long parenDepartmentId;

  void delete(Integer departmentId) {
    Department department = null;//  sql 查询 departmentId
    if (department == null) {
      // 根据场景返回异常
      return;
    }

    // 获取所有下级部门 id
    List<Long> ids = new ArrayList<>();
    ids.add(department.departmentId);
    List<Long> current = new ArrayList<>();
    current.add(department.departmentId);
    do {
      // sql 通过 current 获取所有下级 部门
      List<Department> subDepartment = null;
      current.clear();
      if (subDepartment != null && !subDepartment.isEmpty()) {
        for (Department department1 : subDepartment) {
          ids.add(department1.departmentId);
          current.add(department1.departmentId);
        }
      }
    } while (!current.isEmpty());

    // sql 删除所有 ids 中的部门

  }

  List<Department> getDepartments() {
    // 查询 parent_department_Id == 0 的所有部门
    // 可以调用每个对象的 #getSubDepartment 方法获取下级部门
    return null;
  }

  List<Department> getSubDepartment() {
    // sql 查询下一级 department
    return null;
  }

  public long getDepartmentId() {
    return departmentId;
  }
}
