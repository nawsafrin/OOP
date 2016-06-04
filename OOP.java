import java.util.*;
///********** Inhritance ***************
class Box{
	double width,height,depth;
	Box(Box ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	Box(){
		width = height = depth = -1;
	}
	Box(double len) {
		width = height = depth = len;
	}
	double volume()
	{
		return width * height * depth;
	}
	public void show(){  
        System.out.println("Plain Box with no weight");  
    }  
	
}
class BoxWeight extends Box {
	double weight;
	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
	public void show(){  
        System.out.println("Weighted Box with  weight" + weight);  
    }  
}
		//************* use of super ************
class A{
	int i;
}
class B extends A{
	int i;//this i hides the i in A
	B(int a,int b){
		super.i=a;//i in A
		i=b;//i in B
	}
	
	void show(){
		System.out.println("i in superclass:"+super.i);
		System.out.println("i in subclass:"+i);
	}
}

//*************************************************************
//**************** Polymorphism *********************************
	// ********************** Method Overloading ****************

class Overloadtest {  
    public void show(String s){  
        System.out.println("First Method with only String- "+ s);  
    }  
    public void show (int i){  
        System.out.println("Second Method with only int- "+ i);  
    }  
    public void show (String s, int i){  
        System.out.println("Third Method with both- "+ s + " & " + i);  
    }  
}  
	//*************************************************************

	// ******************** Method Oveerriding *********************

	//*************************************************************

//*************************************************************

// **************** Abstract Class **********************
abstract class Sum{
   //abstract methods
   public abstract int SumOfTwo(int n1, int n2);
   public abstract int SumOfThree(int n1, int n2, int n3);
   //Regular method 
   public void disp(){
      System.out.println("Method of class Sum");
   }
}

class AbstractDemo extends Sum{
   public int SumOfTwo(int num1, int num2){
	return num1+num2;
   }
   public int SumOfThree(int num1, int num2, int num3){
	return num1+num2+num3;
   }
 
}

// *****************************************************************

// **************** Interface **********************
interface  SumInterface{
   //abstract methods
   int SumOfTwo(int n1, int n2);
   int SumOfThree(int n1, int n2, int n3);
   
}

class interfaceDemo implements  SumInterface{
   public int SumOfTwo(int num1, int num2){
	return num1+num2;
   }
   public int SumOfThree(int num1, int num2, int num3){
	return num1+num2+num3;
   }
 
}

// *****************************************************************

public class OOP
{
//************* Encapsulation************
	private int num;
			
	public OOP()
	{
		this.num=0;		
	}		
	
	public void set_num(int num)
	{
		this.num=num;
	}
	
	public int get_num()
	{
		return this.num;
	}
//***************************************************	
	public static void main(String args[])
	{
		OOP obj;
		obj=new OOP();
		obj.set_num(10);
		System.out.println(obj.get_num());
//*************************Inheritance*****************************		
		
		BoxWeight weightbox=new BoxWeight(3,5,7,8.37);
		Box plainbox=new Box();
		double vol = weightbox.volume();
		System.out.println();
		
		System.out.println("Volume is "+vol);

		System.out.println();

		
		//****** use of super in inheritance **********
		
		B subOb=new B(1,2);
		subOb.show();
		System.out.println();
		
// ********************** Method Overloading ****************

		Overloadtest ob = new Overloadtest();  
        ob.show("Welcome");
        ob.show(10);  
          
        ob.show("Hello", 100); 

//***********************************************************

// ******************** Method Oveerriding *********************

		System.out.println();

		plainbox.show();
		weightbox.show();

// **********************************************************************

// ******************** Abstract Class *********************
		
		System.out.println();
		AbstractDemo absobj = new AbstractDemo();
	    System.out.println(absobj.SumOfTwo(3, 7));
	    System.out.println(absobj.SumOfThree(4, 3, 19));
	    absobj.disp();
	    
// **********************************************************************

// ******************** Interface *********************
		
		System.out.println();
		interfaceDemo intobj = new interfaceDemo();
	    System.out.println(intobj.SumOfTwo(3, 7));
	    System.out.println(intobj.SumOfThree(4, 3, 19));
	    
// **********************************************************************


	}
}

