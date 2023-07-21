package com.silk.mapper;

import java.util.List;
import java.util.Map;

import com.silk.entity.Room;


public interface RoomMapper {

	public int create(Room room);

	public int delete(Integer id);

	public int update(Room room);

	public int updateSelective(Room room);

	public List<Room> query(Room room);

	public Room detail(Integer id);

	public int count(Room room);


	public int buildingTotalStudentBedAmount(Integer buildingId);




}