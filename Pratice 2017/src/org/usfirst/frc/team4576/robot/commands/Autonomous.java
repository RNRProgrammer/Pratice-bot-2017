package org.usfirst.frc.team4576.robot.commands;

import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class Autonomous extends Command {

	@Override
	protected void initialize() {
		Robot.chassis.initAuto();

	}

	@Override
	protected void execute() {
		//-,+ for forward, +,- for backwards
		Robot.chassis.setLeftRight(-0.25, 0.25);
		Timer.delay(2);
		Robot.chassis.setLeftRight(0, 0);

	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		Robot.chassis.setLeftRight(0, 0);
		

	}

	@Override
	protected void interrupted() {

	}

}