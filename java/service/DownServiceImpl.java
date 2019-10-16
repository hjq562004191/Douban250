package service;

import Pojo.Page;
import util.PageDownLoadUtil;

public class DownServiceImpl implements DownLoadService{
    public Page dowload(String url) {
        Page page = new Page();
        page.setContent(PageDownLoadUtil.getPageContent(url));
        return null;
    }
}
