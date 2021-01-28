class Main 
{
  public static void main(String[] args) 
  {
    String [][] coordinates = new String[3][5];
    //populate the array
    for(int i = 0; i < coordinates.length; i++)
    {
      for(int j = 0; j < coordinates[i].length; j++)
      {
        //for 3d for(int k = 0; k < coordinates[i][j].length; k++)
        coordinates[i][j] = "(" + i + "," + j + ")";
      }//end inner for loop for the columns
    }//end outer for loop for the rows

    //print out the array
    System.out.println("---Output the coordinates---");
    for(int i = 0; i < coordinates.length; i++)
    {
      for(int j = 0; j < coordinates[i].length; j++)
      {
        System.out.print(coordinates[i][j] + "\t");
      }//end inner for loop
      System.out.println("\n");
    }//end outer for loop

  }//end main method
}//end Main method