package ocp_self_test;
import java.io.*;
 class Vehicle { }
 class Wheels { }
 class Car extends Vehicle implements Serializable { }
 class Ford extends Car { }
 class Dodge extends Car {
 Wheels w = new Wheels();
 }