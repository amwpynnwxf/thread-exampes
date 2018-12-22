package com.samples.design.state;

public class BookedState implements RoomState {
	Room room;
	
	public BookedState(Room room) {
		this.room = room;
	}

	@Override
	public void booking() {
		System.out.println("��ͻ�������ظ�Ԥ��");
	}

	@Override
	public void checkin() {
		System.out.println("��ס�ɹ���");
		room.setState(room.getCheckinState());
	}

	@Override
	public void checkout() {
		//���账��
	}

}
