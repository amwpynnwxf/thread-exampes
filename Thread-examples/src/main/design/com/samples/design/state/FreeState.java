package com.samples.design.state;

public class FreeState implements RoomState {
	Room room;
	
	public FreeState(Room room) {
		this.room = room;
	}

	@Override
	public void booking() {
		System.out.println("预订成功");
		room.setState(room.getBookedState());
	}

	@Override
	public void checkin() {
		System.out.println("还没有预订，请先预订");
		room.setState(room.getCheckinState());
	}

	@Override
	public void checkout() {
		//无需处理
	}

}
