

work_hours=[('abbi',100),('ani',200),('abhi',500)]
def employee_check(work_hours):
    current_max=0
    embloyee_of_month=''
    for employee,hours in work_hours:
        if hours>current_max:
           current_max = hours
           employee_of_month=employee
    else:
        pass
    print(employee_of_month,current_max)
employee_check(work_hours)