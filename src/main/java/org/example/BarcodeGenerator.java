package org.example;

import com.itextpdf.text.*;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import uk.org.okapibarcode.backend.Code128;
import uk.org.okapibarcode.graphics.Color;
import uk.org.okapibarcode.output.Java2DRenderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class BarcodeGenerator {

    protected static void generateOkapiBarcode(String barcodeText) throws Exception {

        String fileName = barcodeText.toUpperCase();

        Code128 barcode = new Code128();
        barcode.setFontName("Arial");
        barcode.setFontSize(20);
        barcode.setModuleWidth(2);
        barcode.setBarHeight(80);

        barcode.setContent(fileName);

        int width = barcode.getWidth();
        int height = barcode.getHeight();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D g2d = image.createGraphics();
        Java2DRenderer renderer = new Java2DRenderer(g2d, 1, Color.WHITE, Color.BLACK);
        renderer.render(barcode);

        ImageIO.write(image, "png", new File(fileName +".png"));

        createPdfFile(width, height, fileName);

        File fileToDelete = new File(fileName +".png");
        fileToDelete.delete();

    }

    private static void createPdfFile(int width, int height, String filename) throws DocumentException, IOException {
        int spaceWidth = 20;
        int spaceHeight = 10;

        Rectangle STICKER_SIZE = new Rectangle(width + spaceWidth, height + spaceHeight);
        String pathPDF = "src/main/resources/PDFimage/";

        Document document = new Document(STICKER_SIZE,10F,10F,10F,10F);
        PdfWriter.getInstance(document, new FileOutputStream(pathPDF + filename +".pdf"));
        document.open();
        document.add(com.itextpdf.text.Image.getInstance(filename +".png"));
        document.close();
    }

    protected static void createSerialNumberPDF(ArrayList<String> arrayList) throws Exception {

        for (String ar: arrayList)
            generateOkapiBarcode(ar);
    }
}
