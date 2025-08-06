class karnataka //outer class
{
	String capital="Bangalore";
	class kpl // non-static class=>inner class
	{
		String district,taluk;
			
		kpl(String district,String taluk)
		{
			this.district=district;
			this.taluk=taluk;
		}
		public void display()
		{
			System.out.println("State_Capital: "+capital);
			System.out.println("District: "+district);
			System.out.println("Taluk: "+taluk);
			
		}
	}
}

class demonested
{
	public static void main(String[] qwe)
	{

		karnataka.kpl koppal=new karnataka().new kpl("Koppal","Koppal"); // to access the sub non-static class
		koppal.display();
	}
}