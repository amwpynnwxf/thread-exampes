package com.samples.design.state;

/**
 * 状态模型的上下文类(环境类)
 * @author wuyouwulv
 *
 */
public class Room {
	private RoomState state;// 当前状态实例
	
	//一共有哪些状态，用于具体状态的使用
	private FreeState freeState;//空闲状态
	private BookedState bookedState;//预订成功
	private CheckinState checkinState;//已入住

	public Room() {
		freeState = new FreeState(this);
		bookedState = new BookedState(this);
		checkinState = new CheckinState(this);
		this.state = freeState;
	}
	
	public void booking(){
		state.booking();
	}
	
	public void checkin(){
		state.checkin();
	}
	
	public void checkout(){
		state.checkout();
	}

	public RoomState getState() {
		return state;
	}

	public void setState(RoomState state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "当前状态：" + state.getClass().getName();
	}

	public FreeState getFreeState() {
		return freeState;
	}

	public void setFreeState(FreeState freeState) {
		this.freeState = freeState;
	}

	public BookedState getBookedState() {
		return bookedState;
	}

	public void setBookedState(BookedState bookedState) {
		this.bookedState = bookedState;
	}

	public CheckinState getCheckinState() {
		return checkinState;
	}

	public void setCheckinState(CheckinState checkinState) {
		this.checkinState = checkinState;
	}

}
