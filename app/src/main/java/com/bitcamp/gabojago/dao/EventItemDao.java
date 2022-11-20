package com.bitcamp.gabojago.dao;

import com.bitcamp.gabojago.vo.event.Event;
import com.bitcamp.gabojago.vo.event.EventItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EventItemDao {
//    List<EventItem> findAll();

    int insert(EventItem eventItem);

    int getItemsCountByEventNo(int eventNo);

    List<EventItem> getItemListByEventNo(int eventNo);
    int deleteItemByEventNo(int eventNo);

    int deleteFileByEventNo(int eventNo);

//    int update(EventItem eventItem);
}
