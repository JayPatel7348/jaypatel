

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		FileInputStream fo = new FileInputStream("D://software//Driver//Test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fo);
		
	   int sheets= workbook.getNumberOfSheets();
	   for(int i=0;i<=sheets;i++)
	   {
		  if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"));
		  {
			  XSSFSheet sheet= workbook.getSheetAt(i);
		  }
	   }
	}

	}