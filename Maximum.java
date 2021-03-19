/*Name- Rahul Dey
  Sec-B
  Roll-63*/
class Maximum
{
	public static void main(String rahul[])
	{
		int i,max=Integer.parseInt(rahul[0]);
		for(i=0;i<rahul.length;i++)
		{
			if(Integer.parseInt(rahul[i])>max)
			{
				max=Integer.parseInt(rahul[i]);
			}
		}
		System.out.println("Maximum number is "+max);
	}
}