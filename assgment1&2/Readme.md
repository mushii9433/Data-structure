employee

1. Identify the superclass and subclasses.
The superclass is Employee. The subclasses are FullTimeEmployee, PartTimeEmployee, and Manager.
2. Explain how inheritance reduces code duplication.
Inheritance allows subclasses to reuse common properties and methods from the superclass without rewriting the same code.
3. Identify the method that demonstrates polymorphism.
The calculateSalary() method demonstrates polymorphism because each subclass overrides it to calculate salary differently.
4. Explain why @Override is used.
@Override indicates that a subclass is redefining a method inherited from its superclass and helps detect errors in method overriding.




hospital


Why is MedicalService declared abstract?
MedicalService is declared abstract because it is a general class for different medical services.
2. Can an object be created directly from MedicalService? Explain.
No, an object cannot be created directly from MedicalService because it is an abstract class.
3. What is the difference between an abstract method and a concrete method?
An abstract method has no body, while a concrete method has a body containing code.
4. Why must each concrete subclass implement calculateTotalCost()?
Each concrete subclass must implement calculateTotalCost() to calculate the total cost of its specific medical service.