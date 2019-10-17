package service;

import Pojo.Page;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import java.io.IOException;

/**
 * 解析页面
 */
public class ProcessServiceImpl implements ProcessService {
    pageService pageService = new pageImpl();

    public void process(String content) {
        Page page = new Page();

        HtmlCleaner htmlCleaner = new HtmlCleaner();
        TagNode rootNode = htmlCleaner.clean(content);
        //获取标题
        try {
            for (int i = 1; i <= 25; i++) {
                //标题
                Object[] objects = rootNode.evaluateXPath("//*[@id=\"content\"]/div/div[1]/ol/li["+i+"]/div/div[2]/div[1]/a/span[1]");
                if (objects.length > 0) {//有东西
                    TagNode node = (TagNode) objects[0];
                    System.out.print(node.getText().toString()+ " ");
                    page.setTitle(node.getText().toString());
                }
                Object[] objects1 = rootNode.evaluateXPath("//*[@id=\"content\"]/div/div[1]/ol/li["+i+"]/div/div[2]/div[2]/div/span[2]");
                //分数
                if (objects1.length > 0) {
                    TagNode node = (TagNode) objects1[0];
                    System.out.print(node.getText().toString() + " ");
                    page.setFenshu(node.getText().toString());
                }
                //评论数
                Object[] objects2 = rootNode.evaluateXPath("//*[@id=\"content\"]/div/div[1]/ol/li["+i+"]/div/div[2]/div[2]/div/span[4]");
                if (objects2.length > 0) {
                    TagNode node = (TagNode) objects2[0];
                    System.out.print(node.getText().toString() + " ");
                    page.setCommentcount(node.getText().toString());
                }
                //介绍
                Object[] objects3 = rootNode.evaluateXPath("//*[@id=\"content\"]/div/div[1]/ol/li["+i+"]/div/div[2]/div[2]/p[2]/span");
                if (objects3.length > 0) {
                    TagNode node = (TagNode) objects3[0];
                    System.out.println(node.getText().toString());
                    page.setJieshao(node.getText().toString());
                }
                int result = pageService.save(page);
                if (result == 0){
                    System.out.println("保存失败");
                }
            }

        } catch (XPatherException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
