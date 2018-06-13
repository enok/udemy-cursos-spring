Liskov Substitution Principle
--------------------------------
<<BAD>>

class TrasportationDevice {
   String name;
   String getName() { ... }
   void setName(String n) { ... }
   double speed;
   double getSpeed() { ... }
   void setSpeed(double d) { ... }
   
   Engine engine;
   Engine getEngine() { ... }
   void setEngine(Engine e) { ... }
   void startEngine() { ... }
}

class Car extends TransportationDevice {
   @Override
   void startEngine() { ... }
}

class Bicycle extends TransportationDevice {
   @Override
   void startEngine() /*problem!*/
}

------------------------------------------
<<BETTER>>

class TrasportationDevice {
   String name;
   String getName() { ... }
   void setName(String n) { ... }
 
   double speed;
   double getSpeed() { ... }
   void setSpeed(double d) { ... }
}

class DevicesWithoutEngines extends TransportationDevice {  
   void startMoving() { ... }
}

class DevicesWithEngines extends TransportationDevice {  
   Engine engine;
   Engine getEngine() { ... }
   void setEngine(Engine e) { ... }
 
   void startEngine() { ... }
}

class Car extends DevicesWithEngines {
   @Override
   void startEngine() { ... }
}

class Bicycle extends DevicesWithoutEngines {
   @Override
   void startMoving() { ... }
}

