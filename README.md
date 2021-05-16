# Enterprise-Java-Development-1.06

### Review of Lab 1.06 (Tim Acosta):

Perfekt!

Hinweis:
 * Nutz die toString Methode. https://www.javatpoint.com/understanding-toString()-method

 ```java

   public String getEmployeeDetails() {
           return "Mitarbeiter: " + name + " mit der Mitarbeiternummer: " + id + " hat ein Gehalt von: " + salary;
       }

         //toString
         @Override
         public String toString() {
                 return  "Name: " + getName() +
                         " Gehalt: " + getSalary() +
                         " Abteilung: " + getDepartment() + "\n";
             }

 ```
* Du hast die Logik hier doppelt. setSalary wird nicht genutzt.

 ```java

 public Intern(int salary, String name, int id) {
         super(salary,name, id);
         if(salary>SALARY_LIMIT){
             this.salary = SALARY_LIMIT;
         }
         else this.salary=salary;
     }

     @Override
     public void setSalary(int salary) {
         if (salary > SALARY_LIMIT) {
             this.salary = SALARY_LIMIT;
         } else {
             super.setSalary(salary);
         }
     }

 ```
