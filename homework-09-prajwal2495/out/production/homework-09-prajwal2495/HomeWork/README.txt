A. How is this lab an example of reuse through inheritance ?
ANS:
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of the parent object.
The FIRE, GRASS, WATER inherits the method Attacking where a Pokemon attacks another Pokemon.
We can define our own Attacking method and add it's own abilities and properties depending on the type of Pokemons.
When you inherit from an existing class, you can reuse methods and fields of the parent class, and you can add new methods and fields also.
That’s is how inheritance supports re-usability.

B.Which parts of the lab are examples of polymorphism?
ANS:
Usage of the method Attacking in all the child class ( FIRE, WATER, GRASS )
Usage of the method gotAttacked from Parent class by all the child classes.
Usage of getters and setters to set and get attack of Pokemons of different types based on what type of Pokemon it is attacking.
