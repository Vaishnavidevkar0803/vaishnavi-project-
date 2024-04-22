package pattern;

public class Dec_Asc_Decresing_Incresing {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****

		
		int star=5;//no of stars in 1st row
		for(int i=1;i<=9;i++)//total no of rows 
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<5)// if the row is less than 5 then star-->(decending )
		   {
				star--;
			}
			else// if the row is greater than 5 then increment star by 1-->(ascending)
			{
				star++;
			}
		}
		
	}

}
