# Difference-Objects-Classes
CSC 272 Discussion 1 Topic:

Most of you who have been through our C++ courses most likely know the basics of classes and objects, as they are very related. Those concepts can easily be transcribed to Java since both C++ and Java have many similarities. The difference is the terminology: in C++, classes use "member functions" to operate on what data the class is used for. In Java, they're called methods and they practically have the same purpose. However, the discussion isn't about the differences between C++ and Java. The prompt states to describe the difference between objects and classes, but I will describe them side by side.

Objects and Classes:
Classes are the bread and butter of Java, as it was designed to be object-oriented: the very first thing we learned in our introduction to Java course was that it begins with a class. It serves as a blueprint that can be used to create objects that are "instances" of classes. As stated previously, classes have the Java equivalent of C++ member functions known as methods, which serve their own purpose as defined by their names, variables and statements. Within the class, the methods may or may not function (no pun intended) together, depending on the implementation and requirements of the program.

The classes don't typically change because they're the foundation of the program: that's what objects are for. Objects are instances of the class they represent and serve as their own "containers" of information. Therefore, changing the attributes of one object using the methods defined by the class will not change another object of the same class.

The Scanner Class:
I believe the best example to demonstrate classes and objects is through one of the most basic Java classes: the Scanner. Recall that Scanners are used to read inputs, whether they are through a file or through the keyboard via System.in. What did we have to do to use the scanner? We had to create a scanner object through a declaration like Scanner input = new Scanner(System.in); to "capture" the input and then use a method call to store it in a variable, such as double randomNumber = input.nextDouble();.

Classes and Objects Example:
I originally intended to use the Scanner class in my example but I'm having trouble finding the full code for it (it's possibly proprietary).
