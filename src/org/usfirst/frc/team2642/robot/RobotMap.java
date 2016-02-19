package org.usfirst.frc.team2642.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int frontleft = 0, rearleft = 1, frontright = 2, rearright = 3;	//Drive
	public static int intakeleft = 4, intakeright = 5, kicker = 6;					//Shooter
	public static int aimmotor = 7, aimpot = 0;										//Aim Shooter
	public static int deploymotor = 8, deploypot = 1; 								//Deployer
	public static int roller = 9;													//Roller
 
	
	
}
	// For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

