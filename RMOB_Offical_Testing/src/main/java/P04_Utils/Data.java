package P04_Utils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Data {
	
	// GET THE VALUE FOR THE DESIRED CELL IN THE ROW YOU CHOOSE ( IT WILL RETURN NOT PRINT THE VALUE ) 
    public String Get_Cell_Value( int desiredColumn ,int desiredRow) throws IOException {
    	String CellValue = null ;
		 // Read the Excel file using Apache POI
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\DELL\\eclipse-workspace\\RMOB_Offical_Testing\\src\\main\\java\\P04_Utils\\RMOB_Data.xlsx"));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Get the desired row and column values
        Row row = sheet.getRow(desiredRow);
        Cell cell = row.getCell(desiredColumn);

        // Check the cell type and return the value
        if (cell != null) {
            CellType cellType = cell.getCellType();
            
            if (cellType == CellType.STRING) {
                CellValue = cell.getStringCellValue();
            } else if (cellType == CellType.NUMERIC) {
                CellValue = String.valueOf(cell.getNumericCellValue());

            } else if (cellType == CellType.BOOLEAN) {
                CellValue = String.valueOf(cell.getBooleanCellValue());

            } else if (cellType == CellType.BLANK) {
                System.out.println("<BLANK>");
            }
        }

        // Close the workbook
        workbook.close();
		return CellValue;
	}

	// GET ALL DATA IN ALL ROWS
	@Test
	public void Get_All_Data() throws IOException {
		   // Read the downloaded Excel file using Apache POI
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\DELL\\eclipse-workspace\\RMOB_Offical_Testing\\src\\main\\java\\P04_Utils\\RMOB_Data.xlsx"));
	    Workbook workbook = new XSSFWorkbook(fileInputStream);
	    Sheet sheet = workbook.getSheetAt(0);

	    // Iterate through rows
	    for (Row row : sheet) {
	        // Iterate through columns
	        int lastCellNum = row.getLastCellNum();
	        for (int col = 0; col < lastCellNum; col++) {
	            Cell cell = row.getCell(col);
	            if (cell != null) {
	                CellType cellType = cell.getCellType();
	                if (cellType == CellType.STRING) {
	                    System.out.print(cell.getStringCellValue() + "\t");
	                } else if (cellType == CellType.NUMERIC) {
	                    System.out.print(cell.getNumericCellValue() + "\t");
	                } else if (cellType == CellType.BOOLEAN) {
	                    System.out.print(cell.getBooleanCellValue() + "\t");
	                } else if (cellType == CellType.BLANK) {
	                    System.out.print("<BLANK>\t");
	                }
	            } else {
	                System.out.print("<NULL>\t");
	            }
	        }
	        System.out.println();
	    }
	    // Close the workbook
	    workbook.close();
	}

	// SET A VALUE FOT THE DESIRED CELL IN THE ROW YOU CHOOSE 
	public void Set_Cell_Value(int desiredRow, int desiredColumn, String valueToWrite) throws IOException {
        // Read the Excel file using Apache POI
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\DELL\\eclipse-workspace\\RMOB_Offical_Testing\\src\\main\\java\\P04_Utils\\Report_Data.xlsx"));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Get the desired row
        Row row = sheet.getRow(desiredRow);
        if (row == null) {
            row = sheet.createRow(desiredRow);
        }

        // Get the desired cell
        Cell cell = row.getCell(desiredColumn);
        if (cell == null) {
            cell = row.createCell(desiredColumn);
        } else {
            cell.setCellValue(""); // Clear the existing cell value
        }

        // Set the value to write to the cell
        cell.setCellValue(valueToWrite);

        // Save the changes to the Excel file
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\RMOB_Offical_Testing\\src\\main\\java\\P04_Utils\\Report_Data.xlsx");
        workbook.write(fileOutputStream);

        // Close the workbook and file streams
        fileOutputStream.close();
        workbook.close();
    }

	// SET ALL THE REQUIRED VALUES IF THE METHODE PASS THE TEST 
	public void Set_Methode_Status( int Row , String Name , String Status) throws IOException {
		
		// SET THE SCRIPT NUM 
		Set_Cell_Value(Row, 0, String.valueOf(Row-2));
		
		// SET THE SCRIPT NAME 
		Set_Cell_Value(Row, 1, Name);
		
		// SET THE SCRIPT LANG 
		Set_Cell_Value(Row, 3, "EN");
		
		// SET THE SCRIPT STATUS 
		Set_Cell_Value(Row, 4, Status);
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formmat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
		String formatter = formmat1.format(ldt);	
		
		// SET THE SCRIPT LAST RUN
		Set_Cell_Value(Row, 2, formatter.toString());
	}


}
