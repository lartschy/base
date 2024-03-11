package hu.bme.mit.train.interfaces;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Date;

public interface TrainController {
	Table<Date, Integer, Integer> tachograph = HashBasedTable.create();

	void followSpeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);

	void setJoystickPosition(int joystickPosition);

	void setEmergencyStop(boolean emergencyStop);

	void storeTachographData();

}
