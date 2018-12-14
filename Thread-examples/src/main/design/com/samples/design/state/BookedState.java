package com.samples.design.state;

public class BookedState implements RoomState {
	Room room;
	
	public BookedState(Room room) {
		this.room = room;
	}

	@Override
	public void booking() {
		System.out.println("冲突：请勿重复预订");
	}

	@Override
	public void checkin() {
		System.out.println("入住成功！");
		room.setState(room.getCheckinState());
	}

	@Override
	public void checkout() {
		//无需处理
	}

}
