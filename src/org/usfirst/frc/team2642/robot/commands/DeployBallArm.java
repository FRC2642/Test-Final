package org.usfirst.frc.team2642.robot.commands;

import org.usfirst.frc.team2642.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DeployBallArm extends Command {
	boolean ddefault = false;
	boolean dbutton = false;
	boolean dstate = false;

    public DeployBallArm() {
    	requires(Robot.deployer);
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
    

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	ddefault = dbutton;
    	dbutton = Robot.oi.getxbox().getRawButton(6);
    	if(ddefault != dbutton){
    		dstate = !dstate;
    	}
    	if(dstate){
    		Robot.deployer.setSetpoint(3);
    	}else{
    		Robot.deployer.setSetpoint(.5);
    	}
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
