package Assignment_4;

public class Car {
	int floorIndex=0;
	int slotIndex=0;
	String[] floor;
	String[][] slot;
	int i,j;
	int count=0;
	String carNumber;

	public Car()
	{
		floor=new String[20];
		slot= new String[20][20];
	}
	public Car(String[] floor,String[][] slot)
	{
		this.floor=floor;
		this.slot= slot;
	}
	public void showAvailableParkingFloors()
	{
		for(i=0;i<floor.length;i++)
		{
			for(j=0;j<slot.length;j++)
			{
				if(slot[i][j]==null)
				{
					count++;
				}
			}
			//System.out.println("avvailbale in floor"+i+floor[i]);
			System.out.println("floor"+i+"  and slots available "+ count);

			count=0;
		}
	}
	public void parkACar(String carNum)
	{ boolean flag=true;
	for(i=0;i<floor.length;i++)
	{
		for(j=0;j<slot.length;j++)
		{
			if(carNum==slot[i][j])
			{
				System.out.println("floor" +i+ " slot "+j);
				flag=false;
				break;
			}

		}
	}
	if(flag==true)
	{
		System.out.println("car not in this building!");
	}
	}
	public void parkingCar(int floor1,String carNumber1,int slot1)
	{
		for(i=0;i<floor.length;i++)
		{
			for(j=0;j<slot.length;j++)
			{
				if(i==floor1&&j==slot1)
				{
					slot[i][j]=carNumber1;
					System.out.println("car is parked in this building in this floor"+i+ "slot"+j);
					System.out.println("number :"+slot[i][j]);
				}
			}
		}
	}
	public boolean  getACar(String carNu)
	{
		boolean flag=false;
		for(i=0;i<floor.length;i++)
		{
			for(j=0;j<slot.length;j++)
			{
				if(carNu==slot[i][j])
				{
					System.out.println("floor" +i+ " slot "+j);
					flag=true;	
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		//c.showAvailableParkingFloors();

		c.parkingCar(3, "abc", 3);
		c.parkACar("abc");
		//c.parkingCar(2, "efr", 2);
		//c.parkingCar(1, "xyz", 3);
		//c.getACar("abc");
		System.out.println("Car is Awailable : "+c.getACar("abc"));
	}

}
