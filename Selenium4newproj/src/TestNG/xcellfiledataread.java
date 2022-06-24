package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class xcellfiledataread {

	@Test
	public void dataread() throws IOException
	{
		File f1=new File(System.getProperty("user.dir")+"\\Testdat\\Ak.xlsx");
		FileInputStream fs=new FileInputStream(f1);
		
		//Workbook--->Sheet---->row---->cell
		XSSFWorkbook ws=new XSSFWorkbook(fs);
		
		//Total rows
		int rowcount=ws.getSheet("data").getPhysicalNumberOfRows();
		int cellcount=ws.getSheet("data").getRow(0).getPhysicalNumberOfCells();
		
		Object arr[][]=new Object[rowcount][cellcount];
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=ws.getSheet("data").getRow(i).getCell(j).getStringCellValue();
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
		
		
		
		
		//String value=ws.getSheet("data").getRow(0).getCell(0).getStringCellValue();//down side program in one line
		//System.out.println(value);
		
		/*XSSFSheet sheet1=ws.getSheet("data");
		XSSFRow row1=sheet1.getRow(0);
		XSSFCell cell=row1.getCell(0);
		System.out.println(cell.getStringCellValue());*/
		
		 
		
		
	
	
	}
	
}
