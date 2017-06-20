package excel;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/** 
 * @ClassName: ExcelDemo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author min04.wang
 * @date 2015-8-20 下午2:44:47  
 */
public class ExcelDemo {

	/**
	 * @throws Exception  
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param args
	 * @throws 
	 */
	public static void main(String[] args) throws Exception {

        Workbook wb = new XSSFWorkbook(); //or new HSSFWorkbook();
        CreationHelper creationHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("new sheet");

        // Create a row and put some cells in it. Rows are 0 based.
        Row row = sheet.createRow((short)0);
        // Create a cell and put a value in it.
        Cell cell = row.createCell((short)0);
        cell.setCellValue(1);
        
        DataValidationHelper helper = sheet.getDataValidationHelper();  
        CellRangeAddressList addressList = new CellRangeAddressList(0, 1, 0, 0);
        String[] pos = {"1", "2"};  
        DataValidationConstraint constraint = helper.createExplicitListConstraint(pos);
        DataValidation dataValidation = helper.createValidation(constraint, addressList);  
        
        sheet.addValidationData(dataValidation); 
        
        
        CellRangeAddressList addressList2 = new CellRangeAddressList(2, 3, 0, 0);
        String[] pos2 = {"3", "4"};  
        DataValidationConstraint constraint2 = helper.createExplicitListConstraint(pos2);
        DataValidation dataValidation2 = helper.createValidation(constraint2, addressList2);  
        sheet.addValidationData(dataValidation2);
        
        //numeric value
        row.createCell(1).setCellValue(1.2);

        //plain string value
        row.createCell(2).setCellValue("This is a string cell");

        //rich text string
        RichTextString str = creationHelper.createRichTextString("Apache");
        Font font = wb.createFont();
        font.setItalic(true);
        font.setUnderline(Font.U_SINGLE);
        str.applyFont(font);
        row.createCell(3).setCellValue(str);

        //boolean value
        row.createCell(4).setCellValue(true);

        //formula
        row.createCell(5).setCellFormula("SUM(A1:B1)");

        //date
        CellStyle style = wb.createCellStyle();
        style.setDataFormat(creationHelper.createDataFormat().getFormat("m/d/yy h:mm"));
        cell = row.createCell(6);
        cell.setCellValue(new Date());
        cell.setCellStyle(style);

        //hyperlink
        row.createCell(7).setCellFormula("SUM(A1:B1)");
        cell.setCellFormula("HYPERLINK(\"http://google.com\",\"Google\")");


        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("ooxml-cell.xlsx");
        wb.write(fileOut);
        fileOut.close();
        
        System.out.println("finish!");
	}
	
	
}
