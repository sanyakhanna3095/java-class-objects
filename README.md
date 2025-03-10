# Java Class Object

In-depth explanation of Key Aspects
1. Fields (Attributes)

   Fields store the data for the class. Example: name, location, and foodItems represent the state of a restaurant.


2. Constructor

   A constructor initializes the fields when an object is created.
   Example: The Restaurant constructor sets name, location, and foodItems.


3. Methods
   
    Methods define the behavior of the objects.
   Example:
   displayDetails(): Displays the details of a restaurant.
   isFoodAvailable(String food): Checks if a specific food item is available.


4. Encapsulation

    The fields are marked as private and accessed using methods to ensure controlled data access and modification.


5. Object Creation

    Objects are created using the new keyword.
Restaurant restaurant1 = new Restaurant("Italian Delight", "Downtown", foodItems1);


6. Memory Allocation
    
    Each object has its own memory space for attributes but shares methods.


