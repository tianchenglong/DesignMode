package com.tcl.designmode;

import com.spire.pdf.PdfDocument;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Author: chenglong.tian@foxmail.com
 * <p>
 * create: 2019-05-31 10:33
 * Version: 1.0
 **/
public class pfdToimg {
    public static void main(String[] args) throws IOException {

        //加载PDF文件
        PdfDocument doc = new PdfDocument();
            doc.loadFromFile("C:\\Users\\Administrator\\Desktop\\教育部学历证书电子注册备案表_田成龙.pdf");

         //保存PDF的每一页到图片
        BufferedImage image;
        for (int i = 0; i < doc.getPages().getCount(); i++) {
        image = doc.saveAsImage(i);
              File file =
                  new File(String.format("C:\\Users\\Administrator\\Desktop\\ToImage-img-%d.png", i));
        ImageIO.write(image, "PNG", file);
        }

        doc.close();
}
}
