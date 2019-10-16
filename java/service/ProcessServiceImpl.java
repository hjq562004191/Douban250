package service;

import Pojo.Page;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

/**
 * 解析页面
 */
public class ProcessServiceImpl implements ProcessService {
    public void process(Page page) {
        String content = page.getContent();

        HtmlCleaner htmlCleaner = new HtmlCleaner();
        TagNode rootNode  = htmlCleaner.clean(content);
        //获取标题
        try {
//            Object[] objects = rootNode.evaluateXPath("//*[@id=\"content\"]/h1/span[1]");
//            if (objects.length > 0) {//有东西
//                TagNode node = (TagNode) objects[0];
//                page.setTitle(node.getText().toString());
//            }
            Object[] objects1 = rootNode.evaluateXPath("//*[@id=\"content\"]/div/div[1]/div/div[4]/div/text()");
            if (objects1.length > 0){
                System.out.println(objects1[0].toString());
            }
        } catch (XPatherException e) {
            e.printStackTrace();
        }
    }
}
