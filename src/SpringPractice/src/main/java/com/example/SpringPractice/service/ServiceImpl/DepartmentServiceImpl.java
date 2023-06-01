package com.example.SpringPractice.service.ServiceImpl;

import com.example.SpringPractice.exception.DepNOTFoundException;
import com.example.SpringPractice.model.Department;
import com.example.SpringPractice.repository.DepartmentRepo;
import com.example.SpringPractice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo depRepo;
    @Override
    public Department createDepartment(Department department) {
        return depRepo.save(department);
    }

    @Override
    public Department saveDepartment(Department department) {
        return null;
    }

    @Override
    public List<Department> getDepartmentsList() {
        return depRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws DepNOTFoundException {
        Optional<Department> dep =depRepo.findById(departmentId);
        if(!dep.isPresent()){
            throw new DepNOTFoundException("Wiley Department Not Available with Id you are searching for");
        }
        return dep.get();
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return null;
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {

    }

    @Override
    public Department updateDepartment(Department departmentId, Department department) {
        return null;
    }
}
