
class EmployeeDatabase:
    def __init__(self):
        self.employee_data = dict()

    def add_or_update_employee(self, department, employee_id, name, salary):
        if department in self.employee_data:
            self.employee_data[department][employee_id] = {'name': name, 'salary': salary}
        else:
            self.employee_data[department] = {employee_id: {'name': name, 'salary': salary}}

    def print_employee_details(self, department):
        if department in self.employee_data:
            print(f"Employee details in the {department} Department: ")
            for emp_id, emp_info in self.employee_data[department].items():
                print(f"Employee ID: {emp_id}, Name: {emp_info['name']}, Salary: {emp_info['salary']}")
        else:
            print(f"No employees found in the {department} Department")


database = EmployeeDatabase()

database.add_or_update_employee("HR", 101, "John Doe", 50000)
database.add_or_update_employee("IT", 201, "Alice smith", 80000)
database.add_or_update_employee("HR", 102, "Jane smith", 55000)

database.print_employee_details("HR")
database.print_employee_details("IT")
database.print_employee_details("Finance")




