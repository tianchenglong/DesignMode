package com.tcl.designmode;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import com.spire.pdf.PdfDocument;

import javax.imageio.ImageIO;
import javax.imageio.spi.ImageInputStreamSpi;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/**
 * Author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-05-31 13:06
 * Version: 1.0
 **/
public class fdftoimg2 {
    public static void main(String[] args) throws IOException {
        fsfsdff();
        //getPdfFileText("C:\\Users\\Administrator\\Desktop\\数据挖掘：概念与技术（原书第3版）.pdf");
    }

    private static void fsfsdff() throws IOException {
        //加载PDF文件
        PdfReader reader = new PdfReader("C:\\Users\\Administrator\\Desktop\\教育部学历证书电子注册备案表_田成龙.pdf");
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        //保存PDF的每一页到图片
        BufferedImage image;
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            ByteArrayInputStream in = new ByteArrayInputStream(parser.processContent(i, new SimpleTextExtractionStrategy()).getResultantText().getBytes());    //将b作为输入流；
            image =  ImageIO.read(in);
            File file = new File(String.format("C:\\Users\\Administrator\\Desktop\\ToImage-img-%d.png", i));
            ImageIO.write(image, "PNG", file);
            //in.close();
        }
    }

    /**
     *
     * @Title: getPdfFileText
     * @Description: 获取指定位置pdf的文件内容
     * @param @param fileName
     * @param @return
     * @param @throws IOException
     * @return String 返回类型
     * @throws
     */
    public static String getPdfFileText(String fileName) throws IOException {
        PdfReader reader = new PdfReader(fileName);
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        StringBuffer buff = new StringBuffer();
        TextExtractionStrategy strategy;
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            strategy = parser.processContent(i,
                    new SimpleTextExtractionStrategy());
            buff.append(strategy.getResultantText());
        }
        return buff.toString();
    }
}
