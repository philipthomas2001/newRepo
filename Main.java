public class Main {
    public static void main(String[] args) {


        //Abstraction
        System.out.println("Abstraction");
        AbstractionChild abstractionChild = new AbstractionChild();
        abstractionChild.setName("Lion");
        System.out.println(abstractionChild.getName());
        abstractionChild.animal("orange");
        abstractionChild.sound("roar");
        abstractionChild.speed(50);


        /*
        AbstractionChild abstractionChild2 = new AbstractionChild();
        abstractionChild.animal("Tiger");
        abstractionChild.sound("hihi");
        abstractionChild.speed(30);
        */


        //Inheritance
        System.out.println("Inheritance");
        InheritanceChild inheritanceChild = new InheritanceChild();
        int key = InheritanceChild.key;
        System.out.println("using final and stictic: "+key);
        int addition = inheritanceChild.add(5,10);
        int addition2 = inheritanceChild.add(5,10,15);
        int subtraction = inheritanceChild.sub(10,4);
        System.out.println("Addition with 2 numbers: "+addition);
        System.out.println("Addition with 3 numbers: "+addition2);
        System.out.println("subtraction: " +subtraction);

        //Interface
        System.out.println("Interface");
        InterfaceChild interfaceChild = new InterfaceChild();
        interfaceChild.car("Tesla Y");
        interfaceChild.speed(156);
        interfaceChild.color("Black");
        interfaceChild.carOwner("Ben");
        interfaceChild.carOwnerAge(45);
        interfaceChild.carOwnerPlace("India");


        //For loops
        System.out.println("for loop");
        for(int i=0;i<2;i++){
            System.out.println(i);
        }

        //while loop
        System.out.println("while loop");
        int i=0;
        while(i<2){
            System.out.println(i);
            i++;
        }

        //do while
        System.out.println("do while");
        int k=0;
        do{
            System.out.println(k);
            k++;
        }while(k<2);

    }
}
