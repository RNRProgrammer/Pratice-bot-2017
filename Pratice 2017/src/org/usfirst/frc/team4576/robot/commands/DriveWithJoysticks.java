package org.usfirst.frc.team4576.robot.commands;

import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoysticks extends Command {
	public DriveWithJoysticks(){
		
		requires(Robot.chassis);
        Robot.chassis.initTeleop();
        
	}

	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Robot.chassis.normalDrive();
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {
		
	}

}
