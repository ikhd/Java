class x2d
{
	public static void main(String[]args)
	{
		int[][] table =
		{
			{7,5,6,3},
			{6,0,5,3},
			{4,3,6,8},
			{1,4,7,4}
		};
		
		int max = 0;
		
        for ( int row=0; row < table.length; row++)
		{
			System.out.print("\nRow " + row + ": ");
			for ( int col=0; col < table[row].length;col++)
				System.out.print(table[row][col] + " ");
			System.out.println();
			
		for (int i = 0;i < table.length; i++)
			for (int j = 0; j < table[i].length; j++)
				if (table[i][j] > max)
					max = table[i][j];
		}
				System.out.println("\nMaximum value is: " + max);
		
		}
	}