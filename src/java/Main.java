
import service.ProcessService;
import service.ProcessServiceImpl;

import util.PageDownLoadUtil;


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 250; i+=25) {
            String url = "https://movie.douban.com/top250" + "?start="+i+"&amp;filter=";
            ProcessService ps = new ProcessServiceImpl();
            ps.process(PageDownLoadUtil.getPageContent(url));
        }
    }
}
