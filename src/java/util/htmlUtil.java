package util;

import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

public class htmlUtil {
    /**
     * 获取标签属性值
     * @param tagNode
     * @param xpath
     * @param att   匹配标签值
     * @return
     */
    public static String getAttributeByName(TagNode tagNode,String xpath,String att){
        String  result = null;
        Object[] objects = null;

        try {
            objects = tagNode.evaluateXPath(xpath);
            if (objects.length > 0){
                TagNode node = (TagNode) objects[0];
                result = node.getAttributeByName(att);
            }
        } catch (XPatherException e) {
            e.printStackTrace();
        }
        return result;
    }
}
