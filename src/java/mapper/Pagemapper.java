package mapper;

import Pojo.Page;

import java.util.ArrayList;

public interface Pagemapper {
    void addPage(Page page);
    ArrayList<Page> selectAll();
}
