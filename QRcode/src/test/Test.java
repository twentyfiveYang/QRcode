package test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class Test {

	public static void main(String[] args) throws WriterException, IOException {
		MultiFormatWriter writer = new MultiFormatWriter();
		String contents = "123456789";
		int w = 200;
		int h = 200;
		BitMatrix bitMatrix = writer.encode(contents,BarcodeFormat.QR_CODE, w, h);
		MatrixToImageWriter.writeToPath(bitMatrix, "png",new File("1.png").toPath());
	}

}
