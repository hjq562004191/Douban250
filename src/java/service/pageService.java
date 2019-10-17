package service;

import Pojo.Page;

import java.io.IOException;
import java.util.List;

public interface pageService {
    int save(Page page) throws IOException;
    List<Page> selectAll() throws IOException;
}
