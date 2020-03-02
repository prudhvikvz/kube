package ronak.docker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ronak.docker.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
}
