package app;

import java.io.BufferedReader;

class Train{
    int mileageX;
    int mileageY;
    int mileageZ;
    int fuel;
    public Train()
    {
        mileageX=0;
        mileageY=0;
        mileageZ=0;
        fuel=10;
    }
    public void Run(){
        mileageY+=1;
        fuel-=1;
    }
    public void Jump(){
        mileageZ+=2;
        fuel=-2;
    }
    public void RunAround(){
        mileageX+=1;
        fuel-=-2;
    }
    public void refuel(){
        fuel=10;
    }
}

class Car
{
	private int mileage;	// 走行距離
	private int fuel;	// ガソリン量

	public Car( )
	{
		mileage = 0;
		fuel = 10;
	}
	public void goForward( )
	{
		mileage += 1;
		fuel -= 1;
	}
	public void turnLeft( )
	{
		mileage += 1;
		fuel -= 2;
	}
	public void turnRight( )
	{
		mileage += 1;
		fuel -= 2;
	}
	public int getFuel( )
	{
		return fuel;
	}
	public void refuel( )
	{
		fuel = 10;	// ガソリン満タン（=10）
	}
	public int getMileage( )
	{
		return mileage;
	}
	public void setMileage( int m )
	{
		if( 0 <= m && m <= 20 )
		{
			mileage = m;
		}
	}
}

class Bike{
    int mileageX;
    int mileageY;
    int mileageZ;
    int fuel;
    public Bike()
    {
        mileageX=0;
        mileageY=0;
        mileageZ=0;
        fuel=10;
    }
    public void Run(){
        mileageY+=2;
        fuel-=1;
    }
    public void Jump(){
        mileageZ+=1;
        fuel-=1;
    }
    public void RunAround(){
        mileageX+=3;
        fuel-=2;
    }
    public void refuel(){
        fuel=10;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("乗りたい乗り物を選んでね！");
        System.out.println("→1.車　2.電車　3.原付");
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        int select=br.readLine();
        if(select==1){
            Car car=new Car();
            while(mileage<20){
                String d=null;
                if(fuel<=2){
                    d="f";
                    System.out.println("給油してね");
                }
                else{
                    int rand=(int)(Math.random()*3);
                }
            }
        }
    }
}