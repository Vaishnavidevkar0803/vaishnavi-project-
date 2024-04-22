package pattern;

public class InceasingDecresing_Asc_Desc {

	public static void main(String[] args) 
	{
		//*
		//**
		//***
		//****
		//***
		//**
		//*
	//no. of rows-->7  no of colums-->4 no of stars in 1st row-->1
	int star=1;//no. of stars in 1st row
	
	for(int i=1;i<=7;i++)
	{
	for(int j=1;j<=star;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
	if(i<4)
	{
		star++;
	}
	else
	{
		star--;
	}
	}
	}
}