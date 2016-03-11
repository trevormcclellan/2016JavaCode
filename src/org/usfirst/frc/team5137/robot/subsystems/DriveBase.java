// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team5137.robot.subsystems;

import org.usfirst.frc.team5137.robot.RobotMap;
import org.usfirst.frc.team5137.robot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveBase extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftMotor = RobotMap.driveBaseleftMotor;
    SpeedController rightMotor = RobotMap.driveBaserightMotor;
    RobotDrive chassis = RobotMap.driveBasechassis;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void takeJoystickInput(Joystick driveStick){
    	chassis.arcadeDrive(driveStick);
    }
    
    public void stop() {
    	chassis.drive(0,0);
    }
    
    public void pivotLeft() {
    	leftMotor.set(0.3);
    	//rightMotor.set(-0.5);
    }
    
    public void pivotRight() {
    	//leftMotor.set(-0.5);
    	rightMotor.set(0.3);
    }
    
    public void stopPivot() {
    	leftMotor.set(0);
    	rightMotor.set(0);
    }
    
    public void autoDrive(double speed, double turn) {
    	chassis.arcadeDrive(speed, turn);
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	setDefaultCommand(new Drive());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

