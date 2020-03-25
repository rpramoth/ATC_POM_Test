package trainingWFH;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {
	private XSSFWorkbook workbook = null;
	public static Row row;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//		WebDriverManager.chromedriver().setup();
		//		WebDriver driver =  new ChromeDriver();
		//		
		reader();


	}

	public static void reader() {


		try{

			File file = new File("C:\\Users\\pradeep\\Documents\\Eclipse_Feb 24\\SeleniumTest\\Config\\Book1.xlsx");
			FileInputStream fo = new FileInputStream(file);
			XSSFWorkbook xe = new XSSFWorkbook(fo);
			XSSFSheet xs = xe.getSheetAt(0);
			int rowSize= xs.getLastRowNum();


			for(int i=0; i<=xs.getLastRowNum();i++){
				int columnCount = xs.getRow(i).getLastCellNum();

				for(int j=0;j<xs.getRow(i).getLastCellNum();j++){
								
					if(xs.getRow(i).getCell(j).getCellType()==XSSFCell.CELL_TYPE_STRING){
						System.out.print(xs.getRow(i).getCell(j).getStringCellValue()+"\t");
					}
					if(xs.getRow(i).getCell(j).getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
						System.out.print(xs.getRow(i).getCell(j).getNumericCellValue()+"\t");
					}
								
				}
				System.out.println("");


			}




		}
		catch(Exception e){

		}





	}



}
