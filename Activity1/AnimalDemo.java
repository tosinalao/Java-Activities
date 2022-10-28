package Activity1;

public class AnimalDemo{
    
    public static void main(String [] args) {
       
       Bird b1 = new Bird();
       
       Animal a1 = new Bird(); //upcasting - bird is a child of animal (parent class)
     
       Bird b2 =  (Bird)a1; //correct - downcasting
      
       // Cat c1 = (Cat)a1; // cast exeception
 
       Animal a2 = new Cat(); //upcasting - cat is a child of animal (parent class)
       Cat c1 = (Cat)a2; //  downcasting - (explicit cast of parent clas variable to a child class)

    }
   }