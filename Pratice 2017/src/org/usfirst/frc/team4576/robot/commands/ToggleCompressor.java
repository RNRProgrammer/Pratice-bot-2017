package org.usfirst.frc.team4576.robot.commands;

import org.usfirst.frc.team4576.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ToggleCompressor extends Command {
	public ToggleCompressor() {
		requires(Robot.pneumatics);
	}

	protected void initialize() {
		Robot.pneumatics.toggleComp();
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
