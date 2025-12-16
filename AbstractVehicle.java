abstract class vehicle{//Declares an abstract class named vehicle
    abstract void speed(double distance,double time);//declares an abstract method called speed with parameters distance and time
    abstract void velocity(double displacement,double time);// declares an abstract method called velocity with parameters displacement and time

}//ends vehicle abstract class
    class car extends vehicle{//declares class car,extends vehicle means car inherits the abstract class vehicle
        void speed(double distance,double time){//implements the speed method for the ____car class
        double speed=distance/time;//speed formula
        System.out.println("Speed:"+speed+"km/hrs");//prints speed after calculating
        }//ends speed method
        void velocity(double displacement,double time){//implements velocity method for the car class
        double velocity=displacement/time;//velocity formula
        System.out.println("velocity:"+velocity+"km/hrs");// prints velocity after calculating
        }//ends speed method
    }//ends car class
    class bike extends vehicle{//declares class bike
        void speed(double distance,double time){//implements speed method for bike class
        double speed=distance/time;//speed formula
        System.out.println("Speed:"+speed+"km/hrs");//prints speed after calculating
        }//ends speed method
        void velocity(double displacement,double time){//implements velocity for bike
        double velocity=displacement/time;//velocity formula
        System.out.println("velocity:"+velocity+"km/hrs");//prints velocity after calculating
    }//ends velocity method
}//ends bike class
    public class AbstractVehicle{//declares the main class
        public static void main(String[] args){//main method where execution begins
            vehicle car = new car();//creates a object of car with vehicle reference
            vehicle bike = new bike();//creates a object of bike with vehicle reference

            car.speed(80, 2);//calls speed() method of car
            car.velocity(100, 2);//calls velocity() method of car

            bike.speed(90, 2);//calls speed() method of bike
            bike.velocity(60 , 2);//calls velocity() method of bike
        }
    }// ends main method
