package Marathon3;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Marathon3 {

		
	

		public static String[][] readExcel(String excelSheetName) throws IOException {
			XSSFWorkbook sf = new XSSFWorkbook("./src/main/java/Marathon3/data/"+excelSheetName+".xlsx");
			XSSFSheet sheet = sf.getSheetAt(0);
			String data[][]= new String[3][2];
			
			for (int i=sheet.getFirstRowNum()+1;i<= sheet.getLastRowNum() ;i++) {
				int j=0;
				Iterator<Cell> cellIterator = sheet.getRow(i).cellIterator();
				while (cellIterator.hasNext()) {
					data[i-1][j]=cellIterator.next().getStringCellValue();
					//System.out.println(data[i-1][j]);
					j++;
				}
			}
			sf.close();
			return data;
			
		}

	

}
