package Assignment_4;

public class KeyValue

{
	int keyindex=0;
	int valueindex=0;
	String[] key;
	String[] value;
	int count=0;
	/*default constructor which will allow us to create arrays of key
	 * and values with default size 20 */
	public KeyValue() {
		key=new String[20];
		value= new String[20];
		//System.out.println("default constructor is invoked......");
	}
	/*user defined one we can initialize with our convenient*/
	public KeyValue(String[] key,String[] value) {
		this.key=key;
		this.value= value;
		System.out.println("parameterized constructor is invoked with key size "+key+" and value size "+value);
	}
	/*before adding key and value pair we are checking uniqueness of key string and size of key array*/
	public void put(String ky,String val) {
		if(keyindex<key.length)
		{
			key[keyindex++]=ky;
			value[valueindex++]=val;
			System.out.println("key and values are added...");
		}
		else
		{
			System.out.println("you can't add further because stack is full...");
		}
	}
	public void get(String key)
	{
		int kindex = 0;
		boolean flag=false;
		for(int i=0;i<keyindex;i++)
		{
			if(this.key[i].equals(key))
			{
				flag=true;
				System.out.println("key is found..");
				kindex=i;
				System.out.println("the value associated with key "+key+ " is "+value[kindex]);
				  System.out.println(this.key[i]);
			        System.out.println(this.value[i]);
				break;
			}
		}
			if(flag==false)
			{
				System.out.println("ther is no such key exist...");
			}
				}
	public void remove(String tey)
	{
		for(int i=0;i<keyindex;i++)
		{
		    if (this.key[i].equals(tey))
		    {
		    	this.key[i] = null;
		    	this.value[i] = null;
		        System.out.println("key deleted");
		       
		        break;
		    }
		
		}
	}
		public void display()
		{
			int j=0;
			for(int i=0;i<key.length;i++)
			{
				//for(j=0;j<value.length;j++)
				System.out.println(this.key[i]+":"+this.value[i]);
				
			//System.out.print();
			}
		}
		public void spaceAvailable()
		{
			
		
			for(int i=0;i<key.length;i++)
			{
				if(key[i]==null)
				{
					count++;
				}
			}
				System.out.println("available space :"+count);
			}
		
		public void isEmpty()
		{
			if(count==key.length)
			{
			System.out.println("KV store is empty");	
			}
			else
			{
				System.out.println("KV store is Not empty");
			}
		}
		public void getKeySet()
		{
			for(int i=0;i<key.length;i++)
			{
				System.out.println("reference :"+i +" value :"+key[i]);
			}
		}
		
	
	public static void main(String[] args) {
		//System.out.println("welcome........");
		KeyValue as = new KeyValue();
		as.put("mithu", "cpg");
		as.put("shkdh", "srir");
		as.put("banglore", "bangalore2");
		//System.out.println(as.key[2]);
		as.get("bang");
		//as.remove("bang");
		as.display();
		as.spaceAvailable();
		as.isEmpty();
		as.getKeySet();
		}
}


