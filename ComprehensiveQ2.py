#Comprehensive Assignment Q2
class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age

    def display(self):
        print(f"Name: {self.name}, Grade: {self.grade}, Age: {self.age}")

class School(Student):
    def school_student_display(self):
        print(f"Name: {self.name}, Grade: {self.grade}, Age: {self.age}")

student1 = Student("Karthik", "B", 18)
student1.display()
print()

school_student1 = School("Naren", "A", 19)
school_student1.school_student_display()
